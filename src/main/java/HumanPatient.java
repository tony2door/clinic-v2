public class HumanPatient extends AbstractPatient {

    public HumanPatient(int patientId, String patientName) {
        super(patientId, patientName);
    }

    @Override
    public String toString() {
        return "HumanPatient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}';
    }
}
