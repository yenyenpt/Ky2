import java.util.Scanner;
public class SinhVien {
    static Scanner scanner = new Scanner(System.in);
    private String email;
    private String sdt;
    private String cmnd;
    public void nhap() {
        System.out.println("Nhập email: ");
        email = scanner.nextLine();
        System.out.println("Nhập sdt: ");
        sdt = scanner.nextLine();
        System.out.println("Nhập cmnd: ");
        cmnd = scanner.nextLine();
    }
    public void xuat() {
        System.out.println("Email: " + email);
        System.out.println("SDT: " + sdt);
        System.out.println("CMND: " + cmnd);
    }
    public String getEmail() {
        return email;
    }
    public String getSDT () {
        return sdt;
    }
    public String getCMND () {
        return cmnd;
    }
}
