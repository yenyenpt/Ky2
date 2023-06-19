
package testthithu;

import java.util.Scanner;

public class LaiMayBay {
    static Scanner sc = new Scanner(System.in);
    private String hoTen;
    private double canNang;
    private String vong1;
    private String email;
    private String sdt;
    int tuoi;

    public LaiMayBay() {
    }

    public LaiMayBay(String hoTen, double canNang, String vong1, String email, String sdt, int tuoi) {
        this.hoTen = hoTen;
        this.canNang = canNang;
        this.vong1 = vong1;
        this.email = email;
        this.sdt = sdt;
        this.tuoi = tuoi;
    }
    public void nhap() {
        sc.nextLine();
        System.out.println("Nhap ho ten: "); hoTen = sc.nextLine();
        System.out.println("Nhap can nang: "); canNang = sc.nextDouble();
        System.out.println("Nhap vong 1: "); vong1 = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap email: "); email = sc.nextLine();
        
        System.out.println("Nhap so dien thoai: "); sdt = sc.nextLine();
        System.out.println("Nhap tuoi: "); tuoi = sc.nextInt();
    }
    public void xuat() {
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Can Nang: " + canNang);
        System.out.println("Vong 1: " + vong1);
        System.out.println("Email: " + email);
        System.out.println("So Dien Thoai: " + sdt);
        System.out.println("Tuoi: " + tuoi);       
    }
    
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getVong1() {
        return vong1;
    }

    public void setVong1(String vong1) {
        this.vong1 = vong1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
}
