package ASM1;
import java.util.Scanner;
public class HanhChinh {
    static Scanner scanner = new Scanner(System.in);
    private String id;
    private String hoTen;
    private double luong;
    public HanhChinh() {}
    public double getThuNhap() {
        return luong;
    }
    public double getThueTN() {
        double tienThue;
        if(getThuNhap() > 15000000) {
            tienThue = getThuNhap() / 100 * 12;
        } else if(getThuNhap() > 9000000) {
            tienThue = getThuNhap() / 100 * 10;
        } else {
            tienThue = 0;
        }
        return tienThue;
    }
    public void xuatThongTin() {
        System.out.println("Id: " + getId());
        System.out.println("Họ tên: " + getHoTen());
        System.out.println("Thu Nhập: " + getThuNhap());
        System.out.println("Thuế phải đóng: " + getThueTN());
    }
    public void nhap() {
        scanner.nextLine();
        System.out.println("Nhập mã nhân viên: ");
        id = scanner.nextLine();
        System.out.println("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập tiền lương: ");
        luong = scanner.nextDouble();
    }
    public String getId() {
        return id;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public double getLuong() {
        return luong;
    }
}
