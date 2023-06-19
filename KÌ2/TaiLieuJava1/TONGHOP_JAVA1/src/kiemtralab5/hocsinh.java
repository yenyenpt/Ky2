/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtralab5;

import java.io.Serializable;

/**
 *
 * @author duongvancuong
 */
public class hocsinh implements Serializable {

    private String hoten;
    private double diem;
    private String he;

    public String xeploai() {
        String kq = "";
        if (diem < 30) {
            kq = "Truot";
        } else {
            kq = "Dau";
        }
        return kq;
    }

    public hocsinh() {
    }

    public hocsinh(String hoten, double diem, String he) {
        this.hoten = hoten;
        this.diem = diem;
        this.he = he;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setHe(String he) {
        this.he = he;
    }

    public String getHoten() {
        return hoten;
    }

    public double getDiem() {
        return diem;
    }

    public String getHe() {
        return he;
    }

}
