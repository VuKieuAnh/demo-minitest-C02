package storage;

import model.Vehicle;

import java.util.ArrayList;

public interface IReadWriteFile<T> {
    void writeFileVehicles(ArrayList<T> vehicles);
    ArrayList<T> getVehicles();
}
