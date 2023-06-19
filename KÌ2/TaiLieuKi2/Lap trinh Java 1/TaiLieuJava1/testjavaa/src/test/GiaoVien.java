package test;
import java.util.Scanner;
public class GiaoVien {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    private double luong;
    public GiaoVien(String name, int age, double luong) {
        this.name = name;
        this.age = age;
        this.luong = luong;
    }
    public GiaoVien(){}
    public void nhap() {
        scanner.nextLine();
        System.out.println("Nhập tên: ");name = scanner.nextLine();
        System.out.println("Nhập tuổi: "); age = scanner.nextInt();
        System.out.println("Nhập lương: ");luong = scanner.nextDouble();
    }
    public void xuat() {
        System.out.println("\n");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("lương: " + luong);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public String getName() {
        return name;
    }
    public int getAge () {
        return age;
    }
    public double getLuong() {
        return luong;
    }
}
