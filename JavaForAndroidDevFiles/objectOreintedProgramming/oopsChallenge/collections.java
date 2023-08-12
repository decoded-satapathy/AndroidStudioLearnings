package objectOreintedProgramming.oopsChallenge;

import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        ArrayList<organs> organList = new ArrayList<>();
        organList.add(new organs("Heart", "Heart attack", "HeartRate"));
        organList.add(new organs("Skin", "Burnt","Smooth and pulpy"));
        
        for(organs o : organList){
            o.getOrganName();
            o.getMedicalCondition();
            System.out.println(o.getCharacteristic());
        }
    }
}
