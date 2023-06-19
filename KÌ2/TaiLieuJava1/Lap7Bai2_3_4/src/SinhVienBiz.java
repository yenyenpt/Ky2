public class SinhVienBiz extends SinhVienPoLy{
    private double diemMaketing;
    private double diemSales;
    public SinhVienBiz(String hoTen, double diemMaketing, double diemSales) {
        super(hoTen);
        this.diemMaketing = diemMaketing;
        this.diemSales = diemSales;
    }
    @Override
    public String getHocLuc() {
        return super.getHocLuc();
    }

    @Override
    public double getDiem() {
        return (2 * diemMaketing + diemSales)/3;
    }
}
