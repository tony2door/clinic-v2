import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HumanClinic extends AbstractClinic {
    Map<Integer, AbstractPatient> currentPatients = new HashMap<>();

    @Override
    public void addPatient(AbstractPatient patient) {
        if (patient == null){
            throw new IllegalArgumentException("patients must not be null");
        }
        currentPatients.put(patient.patientId, patient);
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
        for (Map.Entry<Integer, AbstractPatient> ap : currentPatients.entrySet()) {
            System.out.println(ap.getKey() + " " + ap.getValue());
        }
    }
}
