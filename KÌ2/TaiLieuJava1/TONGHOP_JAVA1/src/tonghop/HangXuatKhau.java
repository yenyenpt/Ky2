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
public class HangXuatKhau extends HangHoa{
    private String quocGia;

    public HangXuatKhau() {
    }

    public HangXuatKhau(String quocGia) {
        this.quocGia = quocGia;
    }

    public HangXuatKhau(String quocGia, int maHang, String tenHang, int soLuong, double donGia) {
        super(maHang, tenHang, soLuong, donGia);
        this.quocGia = quocGia;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
    
    @Override
    public void nhapHH(){
        super.nhapHH();
        System.out.println("Nhập tên quốc gia: ");
        quocGia = sc.next();  
}
    @Override
    public void hienHH(){
        super.hienHH();
        System.out.println("Tên quốc gia: " + quocGia);
    }
}
