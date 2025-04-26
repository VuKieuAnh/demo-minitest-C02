package controller;

import model.Vehicle;
import storage.VehicleStorage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VehicleManager {
    static ArrayList<Vehicle> vehicles = VehicleStorage.getVehicles();

    public static void addVehicle(Vehicle v){
        vehicles.add(v);
        VehicleStorage.writeFileVehicles(vehicles);
    }


    public static void removeVehicle(String id){

    }


    public static void displayAllVehicles(){
        for(Vehicle v : vehicles){
            System.out.println(v);
        }
    }


    public static void displayTaxReport(){}
//    – in id và thuế


    public static void sortByYear(){
        Collections.sort(vehicles);
    }
//    – dùng Comparable


    public static void sortByBrand(){}
//    – dùng Comparator


    public static void sortByTax(){
        Comparator<Vehicle> byTax = new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return (int) (o1.calculateTax() - o2.calculateTax());
            }
        };
        Collections.sort(vehicles, byTax);
    }
//    – dùng Comparator

//
//    void printHistory()

}
