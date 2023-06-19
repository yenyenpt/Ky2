import java.util.Scanner;
public abstract class SinhVienPoLy {
    static Scanner scanner = new Scanner(System.in);
    private String hoTen;
    private String nganh;
    public SinhVienPoLy(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public SinhVienPoLy(String hoTen) {
        this.hoTen = hoTen;
    }
    public SinhVienPoLy() {}
    public void nhap() {
        System.out.println("Nhập tên sinh viên: ");
        hoTen = scanner.nextLine();
    }
    abstract public double getDiem();
    public String getHocLuc() {
        if(getDiem() < 5) {
            return "Yếu";
        } else if (getDiem() < 6.5) {
            return "Trung Bình";
        } else if(getDiem() < 7.5) {
            return "Khá";
        } else if(getDiem() < 9) {
            return "Giỏi";
        } else return "Xuất sắc";
    }
}
