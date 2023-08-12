package objectOreintedProgramming.oopsChallenge;

public class organs {
    private String organName;
    private String medicalCondition;
    private String characteristic;
     
    organs(String organName, String medicalCondition, String characteristic){
        this.organName = organName;
        this.medicalCondition = medicalCondition;
        this.characteristic = characteristic;
    }

    public void getOrganName() {
        System.out.println("Organ name : "+organName);
    }

    public void getMedicalCondition() {
        System.out.println("Medical condtion : "+medicalCondition);
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic( String characteristic){
        this.characteristic = characteristic;
    }
}