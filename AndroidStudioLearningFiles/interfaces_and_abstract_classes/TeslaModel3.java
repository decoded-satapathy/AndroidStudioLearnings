package interfaces_and_abstract_classes;

public class TeslaModel3 implements CarInterface, EngineInterface{
    private String nameOfOwner;

    TeslaModel3(String nameofOwner){
        this.nameOfOwner = nameofOwner;

    }


    @Override
    public void start(){
        System.out.println("Good morning "+nameOfOwner+"\nThe flow of electricity beguns...");
    }

     @Override
    public boolean isSpeedSafe(int speed){
        if(speed>60){
            System.out.println("Not safe, reduce your speed immediately!");
            return true;
        }else{
            System.out.println("The speed of the car is perfectly fine, continue driving.");
            return false;
        }
    }
    
    @Override
    public void printModelNumber(){
        System.out.println("Model number : "+this.modelNumber);
    }

    @Override
    public  void setModelNumber(int modelNumber){
        // this.modelNumber = modelNumber;
    }
}
