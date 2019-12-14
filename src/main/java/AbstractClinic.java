import java.util.List;

public abstract class AbstractClinic {

    public abstract void addPatient(AbstractPatient patient);

    public abstract void addBulkPatients(List<AbstractPatient> patients);

    public abstract void removePatientByPatientObject(AbstractPatient patient);

    public abstract void removePatientByPatientId(Integer patientId);

    public abstract void listPatients();

}

