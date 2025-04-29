package storage.employee;

import model.Employee;
import storage.IReadWriteFile;

import java.util.ArrayList;

public class ReadWriteEmployee implements IReadWriteFile<Employee> {
    @Override
    public void writeFileVehicles(ArrayList<Employee> vehicles) {

    }

    @Override
    public ArrayList<Employee> getVehicles() {
        return null;
    }
}
