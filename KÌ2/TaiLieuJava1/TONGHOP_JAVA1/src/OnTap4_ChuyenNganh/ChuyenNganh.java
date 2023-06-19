/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap4_ChuyenNganh;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class ChuyenNganh {
    static final Scanner sc = new Scanner(System.in);
    private String ten;
    private int maChuyenNganh;
    private int soGiangVien;
    

    public ChuyenNganh() {
    }

    public ChuyenNganh(String ten, int maChuyenNganh, int soGiangVien) {
        this.ten = ten;
        this.maChuyenNganh = maChuyenNganh;
        this.soGiangVien = soGiangVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(int maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public int getSoGiangVien() {
        return soGiangVien;
    }

    public void setSoGiangVien(int soGiangVien) {
        this.soGiangVien = soGiangVien;
    }
    
    public void nhapThongTin(){
        System.out.println("Moi nhap ten chuyen nganh: ");
        this.ten = sc.next();
        System.out.println("Moi nhap ma chuyen nganh: ");
        this.maChuyenNganh = sc.nextInt();
        System.out.println("Moi nhap so giang vien: ");
        this.soGiangVien = sc.nextInt();
    }
    
    public void inThongTin(){
        System.out.println("Ten chuyen nganh: " + ten + ", Ma chuyen nganh: " + maChuyenNganh + ", So giang vien: " + soGiangVien);
    }
    
    
}
