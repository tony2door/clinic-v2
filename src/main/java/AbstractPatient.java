public abstract class AbstractPatient {
    protected int patientId;
    protected String patientName;
    protected int problemID;
    protected String problemName;

    public String getProblemName() {
        return problemName;
    }
    public AbstractPatient(int patientId, String patientName, String problemName) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.problemName = problemName;

    }


    public AbstractPatient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }
}
