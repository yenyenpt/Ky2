/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap2_Hoa;

/**
 *
 * @author chuottp
 */
public class HoaHong extends Hoa{
    private String xuatXu;

    public HoaHong() {
    }

    public HoaHong(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public HoaHong(String xuatXu, int ID, String loaiHoa, String mauSac) {
        super(ID, loaiHoa, mauSac);
        this.xuatXu = xuatXu;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }
    
    @Override
    public void nhapHoa(){
        super.nhapHoa();
        System.out.println("Nhap xuat xu: ");
        this.xuatXu = sc.next();
        
    }
    @Override
    public void hienHoa(){
        super.hienHoa();
        System.out.println("Xuat xu: " + xuatXu);
    }
    
}
