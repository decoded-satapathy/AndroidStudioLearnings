package objectOreintedProgramming.oopsChallenge;

public class Eye extends organs{
    private boolean isOpened ;
     Eye(String organName, String medicalCondition, String characteristic, boolean isOpened){
        super(organName, medicalCondition, characteristic);
        this.isOpened = isOpened;
     }

     public void setIsOpened(boolean isOpened){
        this.isOpened = isOpened;
     }

     public boolean getIsOpened(){
        return isOpened;
     }

     public void printAction(){
        if(isOpened == true ){
            System.out.println("\t1. Close the eye");
        }else{
            System.out.println("\t1. Open the eye ");
        }
     }
     public void performAction(){
        if(isOpened){
            System.out.println("The eye is closed");
        }else{
            System.out.println("The eye is opened");
        }
        isOpened = !isOpened;
     }
}
