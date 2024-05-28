package hw16_oop;
/*
public class Bicycle {
    public String modelName;
    public int wheelsCount;

    public void updateTyre() {
        System.out.println("Меняем покрышку");
}
*/

public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void repair() {
        super.repair();
    }
}