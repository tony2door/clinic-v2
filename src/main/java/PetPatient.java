public class PetPatient extends AbstractPatient {



    public PetPatient(int patientId, String patientName, String problemName) {
        super(patientId, patientName, problemName);
        System.out.println("Pet patient: " + patientName + " suffering from " + problemName + " has been added");
    }

    @Override
    public String toString() {
        return "PetPatient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}' + "\n";
    }
}
