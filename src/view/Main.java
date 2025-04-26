package view;

import controller.VehicleManager;
import model.Car;
import model.Vehicle;

import java.io.*;
import java.util.Scanner;

public class Main {
//    static VehicleManager vehicleManager = new VehicleManager();
    public static void main(String[] args) {
//1. them phuong tien
        addNewVehicle();
//2. Hien thi danh sach phuong tien
        VehicleManager.displayAllVehicles();
        Vehicle car = new Car("1", "brand", 2024, 2);
        File file = new File("/Users/kieuanh/Documents/demo-minitest6/src/controller/demo.txt");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(car);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            FileWriter fw = new FileWriter("cars1.txt");
//            fw.write(car.toString());
//            fw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        5=1*2^2 + 0*2^1+ 1*2^0 bit
//          1       0      1
//        4 = 1*2^2 + 0*2^1 + 0*2^0
//            1       0       0


    }

    private static void addNewVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin moi ban nhap id");
        String id = scanner.nextLine();
        System.out.println("Xin moi ban nhap brand");
        String brand = scanner.nextLine();
        System.out.println("Xin moi ban nhap year");
        int year = scanner.nextInt();
        System.out.println("Xin moi ban nhap number of seats");
        int seats = scanner.nextInt();
        Vehicle car = new Car(id, brand, year, seats);
        VehicleManager.addVehicle(car);
    }
}
