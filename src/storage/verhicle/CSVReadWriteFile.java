package storage.verhicle;

import model.Vehicle;
import storage.IReadWriteFile;

import java.util.ArrayList;

public class CSVReadWriteFile implements IReadWriteFile<Vehicle> {
    @Override
    public void writeFileVehicles(ArrayList<Vehicle> vehicles) {

    }

    @Override
    public ArrayList<Vehicle> getVehicles() {
        return null;
    }
}
