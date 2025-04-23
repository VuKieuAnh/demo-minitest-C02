package model;

public class Car extends Vehicle {
    private int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String id, String brand, int year, int numberOfSeats) {
        super(id, brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    public Car() {
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                '}';
    }

    @Override
    void displayInfo() {

    }

    @Override
    public double calculateTax() {
        return numberOfSeats*300;
    }
}
