package model;

public class Motorbike extends Vehicle {
    private int enginePower;

    public Motorbike() {
    }

    public Motorbike(int enginePower) {
        this.enginePower = enginePower;
    }

    public Motorbike(String id, String brand, int year, int enginePower) {
        super(id, brand, year);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    void displayInfo() {

    }

    @Override
    public double calculateTax() {
        return enginePower<100?500:1000;
    }
}
