/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tonghop;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class HangHoa {
    static final Scanner sc = new Scanner(System.in);
    private int maHang;
    private String tenHang;
    private int soLuong;
    private double donGia;

    public HangHoa() {
    }

    public HangHoa(int maHang, String tenHang, int soLuong, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhapHH(){
        System.out.println("Mời nhập mã hàng: ");
        this.maHang = sc.nextInt();
        System.out.println("Mời nhập tên hàng: ");
        this.tenHang = sc.next();
        System.out.println("Mời nhập so lượng hàng: ");
        this.soLuong = sc.nextInt();
        System.out.println("Mời nhập đơn giá: ");
        this.donGia = sc.nextDouble();
    }
    public void hienHH(){
        System.out.println("Mã hàng: " + maHang + ", Tên hàng : " + tenHang + ", Số lượng: " + soLuong + ", Đơn giá: " + donGia);
    }
     
}
