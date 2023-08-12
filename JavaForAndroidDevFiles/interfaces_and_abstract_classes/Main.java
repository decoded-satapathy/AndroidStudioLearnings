package interfaces_and_abstract_classes;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new TeslaModel3("Om");
        carInterface.start();
        carInterface.isSpeedSafe(150);
    }
}
