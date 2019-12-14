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
        System.out.println("Human patient " + patientName + " suffering from " + problemName + " has been added");
    }


    public AbstractPatient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
        System.out.println("Human patient " + patientName + " suffering from " + problemName + " has been added");
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }
}
