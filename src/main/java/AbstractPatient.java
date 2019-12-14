public abstract class AbstractPatient {
    protected int patientId;
    protected String patientName;
    protected int problemID;

    public AbstractPatient(int patientId, String patientName, int problemID) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.problemID = problemID;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }
}
