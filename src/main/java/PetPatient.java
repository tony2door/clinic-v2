public class PetPatient extends AbstractPatient {



    public PetPatient(int patientId, String patientName) {
        super(patientId, patientName);
    }

    @Override
    public String toString() {
        return "PetPatient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}' + "\n";
    }
}
