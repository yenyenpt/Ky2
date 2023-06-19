
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuottp
 */
public class SinhVien {
   private static final Scanner sc = new Scanner(System.in);
   private String maSV;
   private String hoTen;
   private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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
        System.out.println("Nhap ho ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ma so sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.println("Nhap ten chuyen nganh: ");
        this.chuyenNganh = sc.nextLine();
        
    }
    
    public void inThongTin(){
        System.out.println("Ho ten: " + hoTen + ", MSV: " + maSV + ", Chuyen nganh: " + chuyenNganh);
    }
}
