/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap2_Hoa;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Hoa {
    static final Scanner sc = new Scanner(System.in);
    private int ID;
    private String loaiHoa;
    private String mauSac;

    public Hoa() {
    }

    public Hoa(int ID, String loaiHoa, String mauSac) {
        this.ID = ID;
        this.loaiHoa = loaiHoa;
        this.mauSac = mauSac;
    }

    public int getID() {
        return ID;         
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLoaiHoa() {
        return loaiHoa;
    }

    public void setLoaiHoa(String loaiHoa) {
        this.loaiHoa = loaiHoa;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    public void nhapHoa(){
        System.out.println("Moi nhap ID: ");
        this.ID = sc.nextInt();
        System.out.println("Moi nhap loai hoa: ");
        this.loaiHoa = sc.next();
        System.out.println("Moi nhap mau sac: ");
        this.mauSac = sc.next();
    }
    public void hienHoa(){
        System.out.println("ID: " + ID + ", Loai hoa: " + loaiHoa + ", Mau sac: " + mauSac);
        
    }

    public boolean getGia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
