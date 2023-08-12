package objectOreintedProgramming;

public class Phone {
    
    private String name;
    private int modelNumber;
    Phone (){}
    Phone(String name, int modelNumber){
        this.name = name;
        this.modelNumber = modelNumber;
    }

    public void ratingofPhone(int ratingofPhone) {
        System.out.println("Rating of phone: " + ratingofPhone);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setmodelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }
}
