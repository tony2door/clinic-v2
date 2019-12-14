import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        for (int i = 0; i < strings.size(); i++) {
            String patientsSplit = strings.get(i);
            String[] split = patientsSplit.split(",");
            int patientId = Integer.parseInt(split[0]);
            String patientName = split[1];
            int problemID = Integer.parseInt(split[2]);
            AbstractPatient humanPatient = new HumanPatient(patientId, patientName,problemID);
            patients.add(humanPatient);
        }
        return patients;
    }
    public Map<Integer, String> readProblems() throws IOException, URISyntaxException {
        List<String> strings = readFileByName(type.getProblemstxt());

        return null;
    }

    private List<String> readFileByName(String fileName) throws URISyntaxException, IOException {
        URI patients = ClassLoader.getSystemResource(fileName).toURI();
        Path pathOfPatients = Paths.get(patients);
        return Files.readAllLines(pathOfPatients);
    }
}