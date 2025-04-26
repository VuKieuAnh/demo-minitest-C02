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
//        addNewVehicle();
//2. Hien thi danh sach phuong tien
        VehicleManager.displayAllVehicles();

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
