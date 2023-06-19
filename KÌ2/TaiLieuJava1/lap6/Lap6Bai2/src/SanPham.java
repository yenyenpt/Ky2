import java.util.Scanner;

public class SanPham {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private double gia;
    private String hang;
    public SanPham() {}
    public void nhap() {
        sc.nextLine();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập giá: ");
        gia = sc.nextDouble();
        System.out.println("Nhập tên hãng: ");
        hang = sc.nextLine();
    }
    public void xuat() {
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá: " + gia);
        System.out.println("Tên hãng: " + hang);
    }
    public void setHang(String hang) {
        this.hang = hang;
    }
    public String getHang() {
        return hang;
    }
}
