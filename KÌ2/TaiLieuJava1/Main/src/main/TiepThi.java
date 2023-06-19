
package main;


public class TiepThi extends HanhChinh{
     private double doanhSo;
    private double hueHong;
    public TiepThi() {}

    @Override
    public void nhap() {
        super.nhap(); 
         System.out.println("Nhập doanh số: "); doanhSo = scanner.nextDouble();
        System.out.println("Nhập hoa hồng: "); hueHong = scanner.nextDouble();
    }
    @Override
    public double getLuong() {
        return super.getLuong() + doanhSo / 100 * hueHong;
    }
}

