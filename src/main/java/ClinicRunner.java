import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ClinicRunner {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ClinicReader fileReader = new ClinicFileReader();
        List<AbstractPatient>patients = fileReader.readPatients();
        System.out.println(patients);
        AbstractClinic clinic = new HumanClinic();
        clinic.addBulkPatients(patients);
        clinic.removePatientByPatientId(3);
        clinic.listPatients();
    }
}
