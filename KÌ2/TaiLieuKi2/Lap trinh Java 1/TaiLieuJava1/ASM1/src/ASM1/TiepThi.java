package ASM1;

public class TiepThi extends HanhChinh{
    private double danhSo;
    private double hueHong;
    public TiepThi() {}

   @Override
    public double getThuNhap() {
        double thuNhap = (danhSo / 100 * hueHong) + super.getLuong();
        return thuNhap;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập danh số bán hàng: ");
        danhSo = scanner.nextDouble();
        System.out.println("Nhập % hue hong: ");
        hueHong = scanner.nextDouble();
    }

    public void setDanhSo(double danhSo) {
        this.danhSo = danhSo;
    }
    public double getDanhSo() {
        return danhSo;
    }
    public void setHueHong (double hueHong) {
        this.hueHong = hueHong;
    }
    public double getHueHong() {
        return hueHong;
    }
}
