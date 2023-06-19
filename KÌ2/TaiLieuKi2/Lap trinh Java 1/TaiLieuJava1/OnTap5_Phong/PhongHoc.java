/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap5_Phong;

/**
 *
 * @author chuottp
 */
public class PhongHoc extends Phong {
    private int loaiPhong;

    public PhongHoc() {
    }

    public PhongHoc(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public PhongHoc(int loaiPhong, String ten, double dienTich, int trangThai) {
        super(ten, dienTich, trangThai);
        this.loaiPhong = loaiPhong;
    }

    public int getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(int loaiPhong) {
        this.loaiPhong = loaiPhong;
    }
    
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Loai phong: " + loaiPhong);
        
    }
    
}
