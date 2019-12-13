import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanClinic extends AbstractClinic{
    @Override
    public void addPatient(AbstractPatient patient) {
        Map<Integer, AbstractPatient> currentPatients = new HashMap<>();
        currentPatients.put(patient.patientId,patient);
    }

    @Override
    public void addBulkPatients(List<AbstractPatient> patients) {

    }

    @Override
    public void removePatientByPatientObject(AbstractPatient patient) {

    }

    @Override
    public void removePatientByPatientId(Integer patientId) {

    }

    @Override
    public void listPatients() {

    }
}
