public class HumanPatient extends AbstractPatient {

    public HumanPatient(int patientId, String patientName, int problemID) {
        super(patientId, patientName, problemID);
    }

    @Override
    public String toString() {
        return "HumanPatient {" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}' + "\n";
    }
}
