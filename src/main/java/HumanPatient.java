public class HumanPatient extends AbstractPatient {

    public HumanPatient(int patientId, String patientName,String problemName) {

        super(patientId, patientName, problemName);
    }

    @Override
    public String toString() {
        return "HumanPatient {" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}' + "\n";
    }
}
