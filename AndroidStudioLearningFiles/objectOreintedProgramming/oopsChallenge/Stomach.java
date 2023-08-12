package objectOreintedProgramming.oopsChallenge;

public class Stomach extends organs {
    Stomach(String organName, String medicalCondition, String characteristic){
        super(organName, medicalCondition, characteristic);
    }
    
    public void printAction(){
        System.out.println("\t1. Digest");
     }

     public void performAction(){
        System.out.println("The stomach is digesting");

     }

}
