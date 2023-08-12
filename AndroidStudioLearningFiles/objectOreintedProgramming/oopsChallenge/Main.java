package objectOreintedProgramming.oopsChallenge;

import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public int printMenu(){
        System.out.println("\tChoose an organ:");
        System.out.println("\t1. Left eye\n\t2. Right eye");
        System.out.println("\t3. Heart\n\t4. Stomach");
        System.out.println("\t5. Skin\n\t6. Quit");
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        Eye leftEye = new Eye("Left eye", "Short Sightedness", "Blue", true);
        Eye rightEye = new Eye("Right eye", "Normal", "Blue", true);
        
        Heart heart = new Heart("Heart", "Normal", "65");
        
        Stomach stomach = new Stomach("Stomach", "PUD", "Need to be fed");

        Skin skin = new Skin("Skin", "Burned", "doesn't matter");

        System.out.println("Name : Tom\nAge: 25");
        int choice = main.printMenu();
        
        while((choice <6) && (choice >= 1)){
            if(choice == 1){
                leftEye.getOrganName();
                leftEye.getMedicalCondition();
                System.out.println("Color: "+leftEye.getCharacteristic()); 
                leftEye.printAction();
                int internal_choice = sc.nextInt(); // this sc is which is inside the main funciton as it's also static
                if(internal_choice == 1){
                    leftEye.performAction();
                }
            }
            else if(choice == 2){
                rightEye.getOrganName();
                rightEye.getMedicalCondition();
                System.out.println("Color: "+rightEye.getCharacteristic()); 
                rightEye.printAction();
                int internal_choice = sc.nextInt(); 
                if(internal_choice == 1){
                    rightEye.performAction();
                }
            }
            else if(choice == 3){
                heart.getOrganName();
                heart.getMedicalCondition();
                System.out.println("Heart beat is : "+heart.getCharacteristic()); 
                heart.printAction();
                int internal_choice = sc.nextInt(); // this sc is which is inside the main funciton as it's also static
                if(internal_choice == 1){
                    System.out.print("Enter the heartbeat: ");
                    int heartbeat = sc.nextInt();
                    heart.performAction(String.valueOf(heartbeat)); //String.valueOf makes the given parameter into a string
                }
                
            }
            else if(choice == 4){
                stomach.getOrganName();
                stomach.getMedicalCondition();
                System.out.println(stomach.getCharacteristic());
                stomach.printAction();
                int internal_choice = sc.nextInt(); // this sc is which is inside the main funciton as it's also static
                if(internal_choice == 1){
                    stomach.performAction();
                }
            }
            else if(choice == 5){
                skin.getOrganName();
                skin.getMedicalCondition();
            }else{ 
                System.out.println("Eror 404 ! LOL !!");
            } 
            
            choice = main.printMenu();
        }

        sc.close();
    }
}
