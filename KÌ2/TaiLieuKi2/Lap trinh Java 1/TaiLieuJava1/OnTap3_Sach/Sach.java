/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap3_Sach;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Sach {
    public static final Scanner sc = new Scanner(System.in);
    private String maSach;
    private String tenSach;
    private Integer gia;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, Integer gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

   
    
    public void nhapSach(){
        System.out.println("Moi nhap ma sach: ");
        this.maSach = sc.next();
        System.out.println("Moi nhap ten sach: ");
        this.tenSach = sc.next();
        System.out.println("Moi nhap gia: ");
        this.gia = sc.nextInt();
        
    }
    public void hienSach(){
        System.out.println("Ma sach: " + maSach + ", Ten sach: " + tenSach + ", Gia: " + gia);
    }
}
