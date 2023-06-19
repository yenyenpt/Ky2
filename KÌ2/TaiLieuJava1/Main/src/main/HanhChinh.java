
package main;

import java.util.Scanner;


public class HanhChinh {
    static Scanner scanner = new Scanner(System.in);
    private String id;
    private String hoTen;
    private double luong;
    public HanhChinh () {}
    public HanhChinh(String id, String hoTen, double luong) {
        this.id = id;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public void nhap() {
        scanner.nextLine();
        System.out.println("Nhập id: "); id = scanner.nextLine();
        System.out.println("Nhập họ tên: "); hoTen = scanner.nextLine();
        System.out.println("Nhập lương: "); luong = scanner.nextDouble();
    }
    public double getThueTN() {
        double thue = 0;
        if(getLuong() >= 15000000) {
            return getLuong() / 100 * 12;
        } else if(getLuong() >= 9000000) {
            return getLuong() / 100 * 10;
        } else return thue;
    }
    public void xuatThongTin() {
        System.out.println("Mã Nv: " + getId());
        System.out.println("Họ Tên: " + getHoTen());
        System.out.println("Thu Nhập: " + getLuong());
        System.out.println("Thuế : " + getThueTN());
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public double getLuong() {
        return luong;
    }
}
    

