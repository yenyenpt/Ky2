 public class SinhVienIT extends SinhVienPoLy {
    private double diemJava;
    private double diemCss;
    private double diemHtml;
    public SinhVienIT() {
    }
    public SinhVienIT(String name, double diemJava, double diemCss, double diemHtml) {
        super(name);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }



     @Override
    public String getHocLuc() {
        return super.getHocLuc();
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemCss + diemHtml)/4;
    }
}