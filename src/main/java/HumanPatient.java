public class HumanPatient extends AbstractPatient {

    public HumanPatient(int patientId, String patientName,String problemName) {

        super(patientId, patientName, problemName);
        System.out.println("Human patient: " + patientName + " suffering from " + problemName + " has been added");
    }

    @Override
    public String toString() {
        return "HumanPatient {" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}' + "\n";
    }
}
