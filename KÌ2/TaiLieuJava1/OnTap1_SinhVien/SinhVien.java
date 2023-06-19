/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap1_SinhVien;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class SinhVien {
    static final Scanner sc = new Scanner(System.in);
    private String maSv;
    private String hoTen;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String chuyenNganh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    
    public void nhapThongTin(){
        System.out.println("Moi nhap ma SV: ");
        this.maSv = sc.nextLine();
        System.out.println("Moi nhap ho ten SV: ");
        this.hoTen = sc.nextLine();
        System.out.println("Moi nhap ten chuyen nganh: ");
        this.chuyenNganh = sc.nextLine();
        
        
    }
    
    public void inThongTin(){
        System.out.println("MSV: " + this.maSv + ", Ho ten: " + this.hoTen + ", Chuyen nganh: " + this.chuyenNganh);
    }
}
