public enum PatientTypes {
    HUMANPATIENTS("human_patients.txt", "human_problems.txt"),
    PETPATIENTS("pet_patients.txt", "pet_problems.txt");
    private String patientstxt;
    private String problemstxt;

    PatientTypes(String firstType, String secondType) {
        this.patientstxt = firstType;
        this.problemstxt = secondType;
    }

    public String getPatientstxt() {
        return patientstxt;
    }

    public String getProblemstxt() {
        return problemstxt;
    }
}
