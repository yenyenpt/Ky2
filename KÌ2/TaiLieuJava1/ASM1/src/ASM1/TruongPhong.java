package ASM1;

public class TruongPhong extends HanhChinh{
    private double trachNhiem;
    public TruongPhong() {}

    @Override
    public double getThuNhap() {
        return trachNhiem + super.getLuong();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập tiền trách nhiệm: ");
        trachNhiem = scanner.nextDouble();
    }

    public void setTrachNhien(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    public double getTrachNhien() {
        return trachNhiem;
    }
}