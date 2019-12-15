public class PetPatient extends AbstractPatient {



    public PetPatient(int patientId, String patientName, String problemName) {

        super(patientId, patientName, problemName);
    }

    @Override
    public String toString() {
        return "PetPatient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                '}' + "\n";
    }
}
