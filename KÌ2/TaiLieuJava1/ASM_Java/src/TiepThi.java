public class TiepThi extends HanhChinh {//tạo lớp NhanVien kế thừa lớp HanhChinh
    //thuộc tính mới của lớp tiếp
    private double doanhSo;
    private double hueHong;
    public TiepThi() {}
    //ghì đè phương thức nhập từ lớp HanhChinh để nhập thêm.
    @Override
    public void nhap() {
        super.nhap();//gọi lại lớp nhập từ lớp HanhChinh
        System.out.println("Nhập doanh số: "); doanhSo = scanner.nextDouble();
        System.out.println("Nhập hue hồng: "); hueHong = scanner.nextDouble();
    }
    //ghì đè phương thức tính lương từ lớp HanhChinh để tính lương cho tiếp thị
    @Override
    public double getLuong() {
        return super.getLuong() + doanhSo / 100 * hueHong;//cộng thêm % hoa hồng từ doanh số bán hàng
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }
    public double getDoanhSo() {
        return doanhSo;
    }
    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    public double getHueHong() {
        return hueHong;
    }
}