/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap1_SinhVien;

/**
 *
 * @author chuottp
 */
public class SinhVienPoly extends SinhVien{
    private int chuyenNganhHep;

    public SinhVienPoly() {
    }

    public SinhVienPoly(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(int chuyenNganhHep, String maSv, String hoTen, String chuyenNganh) {
        super(maSv, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        System.out.println("Xin moi nhap chuyen nganh hep: ");
        this.chuyenNganhHep = sc.nextInt();
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Chuyen nganh hep: " + this.chuyenNganhHep);
    }
    
}
