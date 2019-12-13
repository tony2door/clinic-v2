import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanClinic extends AbstractClinic{
    Map<Integer, String> currentPatients = new HashMap<>();
    @Override
    public void addPatient(AbstractPatient patient) {
        currentPatients.put(patient.patientId,patient.patientName);
    }

    @Override
    public void addBulkPatients(List<AbstractPatient> patients) {
        for (int i = 0; i < patients.size(); i++) {
            addPatient(patients.get(i));
        }
    }

    @Override
    public void removePatientByPatientObject(AbstractPatient patient) {

    }

    @Override
    public void removePatientByPatientId(Integer patientId) {
    currentPatients.remove(patientId);
    }

    @Override
    public void listPatients() {
        for (Map.Entry<Integer, String> ap : currentPatients.entrySet()){
            System.out.println(ap.getKey() + " " + ap.getValue());
        }
    }
}
