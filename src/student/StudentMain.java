package student;

import java.io.*;

public class StudentMain {
    public static void main(String[] args) {
        File f = new File("/Users/kieuanh/Documents/demo-minitest6/src/student/student.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            System.out.println(s.getName());
            System.out.println(s.getEmail());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void writeFile() {
        File f = new File("/Users/kieuanh/Documents/demo-minitest6/src/student/student.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Student("1", "2", "3"));
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
