import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClinicFileReader implements ClinicReader {
    PatientTypes type;

    public ClinicFileReader(PatientTypes type) {
        this.type = type;
    }

    public List<AbstractPatient> readPatients() throws IOException, URISyntaxException {
        List<String> strings = readFileByName(type.getPatientstxt());
//aici facem split
        List<AbstractPatient> patients = new ArrayList<>();
        Map<Integer, String> problems = readProblems();
        for (int i = 0; i < strings.size(); i++) {
            String patientsSplit = strings.get(i);
            String[] split = patientsSplit.split(",");
            int patientId = Integer.parseInt(split[0]);
            String patientName = split[1];
            int pacientProblemID = Integer.parseInt(split[2]);
            String problemName = problems.get(pacientProblemID);
            if(type==PatientTypes.HUMANPATIENTS){
                AbstractPatient tempPatient = new HumanPatient(patientId,patientName,problemName);
                patients.add(tempPatient);
            }
            else if(type==PatientTypes.PETPATIENTS){
                AbstractPatient tempPatient = new PetPatient(patientId,patientName);
                patients.add(tempPatient);
            }
        }
        return patients;
    }
    public Map<Integer, String> readProblems() throws IOException, URISyntaxException {

        List<String> strings = readFileByName(type.getProblemstxt());
        Map<Integer,String> problems = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            String problemsSplit = strings.get(i);
            String[] split = problemsSplit.split(",");
            int problemID = Integer.parseInt(split[0]);
            String problemName = split[1];
            problems.put(problemID,problemName);
        }
        return problems;
    }

    private List<String> readFileByName(String fileName) throws URISyntaxException, IOException {
        URI patients = ClassLoader.getSystemResource(fileName).toURI();
        Path pathOfPatients = Paths.get(patients);
        return Files.readAllLines(pathOfPatients);
    }
}