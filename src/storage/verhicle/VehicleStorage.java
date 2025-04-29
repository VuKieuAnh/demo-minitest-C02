package storage.verhicle;

import model.Vehicle;
import storage.IReadWriteFile;

import java.io.*;
import java.util.ArrayList;

public class VehicleStorage implements IReadWriteFile<Vehicle> {
//    ghi file
    public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public ArrayList<Vehicle> getVehicles() {
        File file = new File("vehicles.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            vehicles = (ArrayList<Vehicle>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return vehicles;
    }

    public void writeFileVehicles(ArrayList<Vehicle> vehicles) {
        VehicleStorage.vehicles = vehicles;
        File file = new File("vehicles.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(vehicles);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
