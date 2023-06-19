/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap3_Sach;

/**
 *
 * @author chuottp
 */
public class TapChi extends Sach{
    private String nhaXB;

    public TapChi() {
    }

    public TapChi(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public TapChi(String nhaXB, String maSach, String tenSach, Integer gia) {
        super(maSach, tenSach, gia);
        this.nhaXB = nhaXB;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }
    
    @Override
    public void nhapSach(){
        super.nhapSach();
        System.out.println("Xin moi nhap nha xuat ban: ");
        this.nhaXB = sc.next();
    }
    @Override
    public void hienSach(){
        super.hienSach();
        System.out.println("Nha xuat ban: " + nhaXB);
        System.out.println("-------------------------");
    }
}
