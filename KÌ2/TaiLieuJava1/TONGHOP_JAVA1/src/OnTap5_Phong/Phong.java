/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap5_Phong;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Phong {
    private static final Scanner sc = new Scanner(System.in);
    private String ten;
    private double dienTich;
    private int trangThai;

    public Phong() {
    }

    public Phong(String ten, double dienTich, int trangThai) {
        this.ten = ten;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    public void inThongTin(){
        System.out.println("Ten phong: " + ten + ", Dien tich: " + dienTich + ", Trang Thai: " + trangThai);
    }
    
    
}
