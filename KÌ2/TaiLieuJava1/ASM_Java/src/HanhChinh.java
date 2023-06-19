import java.util.Scanner;
public class HanhChinh {
    // các thuộc tính của nhân viên hành chính
    static Scanner scanner = new Scanner(System.in);
    private String id;
    private String hoTen;
    private double luong;

    public HanhChinh(String id, String hoTen, double luong) {//hàm khởi tạo có tham số
        this.id = id;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public HanhChinh () {}//hàm khởi tạo không tham số
    //tạo phương thức nhập để nhập thông tin nhân viên
    public void nhap() {
        scanner.nextLine();
        System.out.println("Nhập id: "); id = scanner.nextLine();
        System.out.println("Nhập họ tên: "); hoTen = scanner.nextLine();
        System.out.println("Nhập lương: "); luong = scanner.nextDouble();
    }
    //phương thức tính thuế theo yêu cầu
    public double getThueTN() {
        double thue = 0;
        if(getLuong() >= 15000000) {
            return getLuong() / 100 * 12;
        } else if(getLuong() >= 9000000) {
            return getLuong() / 100 * 10;
        } else return thue;
    }
    //phương thức xuẩt thông tin nhân viên
    public void xuatThongTin() {
        System.out.println("Mã NV: " + getId());
        System.out.println("Tên: " + getHoTen());
        System.out.println("Thu Nhap: " + getLuong());
        System.out.println("Thuế: " + getThueTN());
    }
    //Các phương thưc seter để tạo một id , ten , luong mới, getter để trả về một id, tên , luong.
    public void setId(String id) {
        this.id = id;
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