/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralab5;

/**
 *
 * @author duongvancuong
 */
public class sinhvien {
    private String nganh;
    private String masv;
    private String hoten;
    private double diem;

    public sinhvien() {
    }

    public sinhvien(String nganh, String masv, String hoten, double diem) {
        this.nganh = nganh;
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    void getMasv(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
