package view;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        m2();
    }

    public static void m2() {
        try {
            m1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void m1() throws Exception {
        extracted1();
    }


    private static void extracted() {
        System.out.println("Moi ban nhap vao so a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Moi ban nhap vao so b");
        int b = sc.nextInt();
        try {
            System.out.println("Ket qua la " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Con nhung buoc sau nua nha");
    }

    private static void extracted1() throws Exception {
        System.out.println("Moi ban nhap vao so a");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Moi ban nhap vao so b");
        int b = sc.nextInt();
        System.out.println("Ket qua la " + (a/b));
        System.out.println("Ket thuc");
    }
}
