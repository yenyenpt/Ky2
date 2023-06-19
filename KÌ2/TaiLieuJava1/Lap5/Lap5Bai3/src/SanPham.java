import java.util.Scanner;
public class SanPham {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private double gia;
    public SanPham() {}
    public void nhap() {
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        setName(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        setGia(scanner.nextDouble());
    }
    public void xuat() {
        System.out.println("tên sản phẩm: " + getName());
        System.out.println("Giá sản phẩm: " + getGia());

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
    public double getGia() {
        return gia;
    }
}
