package Static_Keyword_inner_classes;

public class anotherclass {
    public static int age;
    public static void printAge(){
        System.out.println("Age : "+age);
    }

    public void callingPrintAgeFunc(){
        System.out.println(age);
        printAge();
    }
}
