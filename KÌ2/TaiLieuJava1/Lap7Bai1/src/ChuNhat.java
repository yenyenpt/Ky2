import java.util.Scanner;
public class ChuNhat {
    static Scanner scanner = new Scanner(System.in);
    private double chieuDai;
    private double chieuRong;
    public void nhap() {
        System.out.println("Nhập chiều dài: ");
        chieuDai = scanner.nextDouble();
        System.out.println("Nhâp chiều rộng: ");
        chieuRong = scanner.nextDouble();
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double getChieuDai() {
        return chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public double getDienTich() {
        return getChieuDai() * getChieuRong();
    }
    public double getChuVi() {
        return (getChieuDai() + getChieuRong()) * 2;
    }
    public void xuat() {
        System.out.println("ChieuRong: " + getChieuRong() + ", chieu dai: " + getChieuDai() + ", diện tích: " + getDienTich() + ", chu  vi: " + getChuVi());
    }
}
