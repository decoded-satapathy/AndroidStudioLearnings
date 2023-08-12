package objectOreintedProgramming.oopsChallenge;

public class Heart extends organs {
    Heart(String organName, String medicalCondition, String heartbeat){
        super(organName, medicalCondition, heartbeat);
    }

    public void printAction(){
        System.out.println("\t1. Change the Heart beat");
     }

     public void performAction(String heartbeat){
        this.setCharacteristic(heartbeat);
        System.out.println("Heart rate changed to : "+heartbeat);

     }
    
}
