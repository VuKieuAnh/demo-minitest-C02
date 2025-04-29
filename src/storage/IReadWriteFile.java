package storage;

import model.Vehicle;

import java.util.ArrayList;

public interface IReadWriteFile {
    void writeFileVehicles(ArrayList<Vehicle> vehicles);
    ArrayList<Vehicle> getVehicles();
}
