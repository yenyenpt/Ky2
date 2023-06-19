/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap6;

/**
 *
 * @author chuottp
 */
public class ChuyenNganhJava extends ChuyenNganh{
    private int soSinhVien;

    public ChuyenNganhJava() {
    }

    public ChuyenNganhJava(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }

    public ChuyenNganhJava(int soSinhVien, String ten, int maChuyenNganh, int soGiangVien) {
        super(ten, maChuyenNganh, soGiangVien);
        this.soSinhVien = soSinhVien;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public void setSoSinhVien(int soSinhVien) {
        this.soSinhVien = soSinhVien;
    }
    
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Moi nhap so sinh vien: ");
        soSinhVien = sc.nextInt();
        
    }
    
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("So sinh vien: " + soSinhVien);
    }
    
    
    
}
