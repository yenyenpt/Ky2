import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<HanhChinh> listNhanVien = new ArrayList<>();//tạo một ArrayList từ class HanhChinh
    public static void main(String [] args) {
        menu();
    }

    private static void menu() {
        int chon;
        do {// tạo menu trong do while để có thể lặp lại đến khi muốn thoát.
            System.out.println("***--------------------MENU------------------***");
            System.out.println("|Chức năng 01: nhập                            |");
            System.out.println("|Chức năng 02: xuất                            |");
            System.out.println("|Chức năng 03: tìm nv theo mã                  |");
            System.out.println("|Chức năng 04: xoá nhân viên theo mã           |");
            System.out.println("|Chức năng 05: cập nhật thông tin theo mã      |");
            System.out.println("|Chức năng 06: tìm nhân viên theo lương        |");
            System.out.println("|Chức năng 07: sắp xếp nhân viên theo họ tên   |");
            System.out.println("|Chức năng 08: sắp xếp nhân viên theo thu nhập |");
            System.out.println("|Chức năng 09: xuất 5 nv luong cao nhat        |");
            System.out.println("|Chức năng 10: thoát                           |");
            System.out.println("***------------------------------------------***");
            System.out.println("\nNhập chức năng: "); chon = scanner.nextInt();
            switch(chon) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    xuat();
                    break;
                }
                case 3: {
                    timtheoId();
                    break;
                }
                case 4: {
                    xoaTheoId();
                    break;
                }
                case 5: {
                    capNhatTheoId();
                    break;
                }
                case 6: {
                    timTheoLuong();
                    break;
                }
                case 7: {
                    sapXepTheoHoTen();
                    break;
                }
                case 8: {
                    sapXepTheoThuNhap();
                    break;
                }
                case 9: {
                    xuatNVLuongCao();
                    break;
                }
                case 10: {
                    System.exit(10);
                }
            }
        }while (true);
    }

    private static void nhap() {
        int chon;
        int n;
        while(true) {//sử dụng while để chọn nhân viên muốn nhập cho đến khi thoát.
            System.out.println("Mời bạn chon 1: Hành Chính, 2: Tiếp thị, 3: truỏng phòng, 4: thoát.");
            chon = scanner.nextInt();
            if(chon == 1) {
                System.out.println("Nhập thông tin nhân viên hành chính: ");
                while(true) {
                    HanhChinh hanhChinh = new HanhChinh();//tạo nhân viên hành chinh không có tham số
                    hanhChinh.nhap();//gọi phương thức nhập
                    listNhanVien.add(hanhChinh);//thêm nhân viên này vào arraylist listnhanvien
                    System.out.println("Nhập tiếp(1, 0)?: "); n = scanner.nextInt();//hỏi ý kiến có muốn nhập nữa không ấn 0 để thoát.
                    if(n == 0) {
                        break;
                    }
                }
            }
            if(chon == 2) {
                System.out.println("Nhập thông tin nhân viên tiếp thị: ");
                while(true) {
                    TiepThi tiepThi = new TiepThi();//tạo mới nhân viên tiếp thi không tham số
                    tiepThi.nhap();//gọi phương thức nhập để nhập
                    listNhanVien.add(tiepThi);//thêm nhân viên tiếp thị vào listnhanvien
                    System.out.println("Nhập tiếp(1, 0)?: "); n = scanner.nextInt();//hỏi ý kiến nhập tiếp hoặc không(0)để thoát.
                    if(n == 0) {
                        break;
                    }
                }
            }
            if(chon == 3) {
                System.out.println("Nhập thông tin trưởng phòng.");
                while(true) {
                    TruongPhong truongPhong = new TruongPhong();//tạo mới nhân viên trưởng phòng không tham số.
                    truongPhong.nhap();//gọi phương thức nhập đẻ nhập.
                    listNhanVien.add(truongPhong);//thêm nhân viên trường phong vào listnhanvien
                    System.out.println("Nhập tiếp(1, 0)?: "); n = scanner.nextInt();//hỏi ý kiến muốn nhập tiếp hoặc không.
                    if(n == 0) {
                        break;
                    }
                }
            }
            if(chon == 4) {//khi chon = 4 thì thoát khỏi vòng lặp while nếu không muốn nhập tiếp nhân viên
                break;
            }
        }

    }

    private static void xuat() {
        System.out.println("***THÔNG TIN NHÂN VIÊN***\n");
        for(HanhChinh hanhChinh: listNhanVien) {//dùng for each để xuất danh sách nhân viên trong listnhanvien
            hanhChinh.xuatThongTin();
        }
    }

    private static void timtheoId() {
        String id;//tạo biến id trong hàm timtheoId
        while(true) {
            scanner.nextLine();
            System.out.println("Nhập mã nhân viên muốn tìm: ");
            id = scanner.nextLine();//nhập id để kiểm tra trùng
            boolean kt = true;
            for(HanhChinh hanhChinh: listNhanVien) {
                if(id.equals(hanhChinh.getId())) {//nếu id nhập vào trùng với id nhân viên trong listnhanvien thì xuất thông tin nhân viên có id đó
                    hanhChinh.xuatThongTin();
                    kt = false;//cho biến kt bằng false để thoái khỏi vòng lặp while vì đã tìm được nhân viên
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {//vì ko tìm thấy nên nhập lại
                System.out.println("Không tìm thấy, mời nhập lại!");
            }
        }
    }

    private static void xoaTheoId() {
        String id;
        while(true) {
            scanner.nextLine();
            System.out.println("Nhập mã sinh viên muốn xoá: ");
            id = scanner.nextLine();//nhập id nhân viên cần tìm
            boolean kt = true;
            for(HanhChinh hanhChinh: listNhanVien) {
                if(id.equals(hanhChinh.getId())) {//nếu id nhập vào trùng với id nhân viên trong listnhanvien thì xoá nhân viên
                    listNhanVien.remove(hanhChinh);
                    System.out.println("xoá thành công.");
                    kt = false;//cho biến kt == false để thoát và vòng lặp while
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {//id ko trùng nên nhập lại
                System.out.println("Không tìm thấy mời nhập lại!");
            }
        }
    }

    private static void capNhatTheoId() {
        String id;
        while(true) {
            scanner.nextLine();
            System.out.println("Nhập mã nhân viên muốn cập nhật: ");
            id = scanner.nextLine();//nhập id nhân viên muốn tìm
            boolean kt = true;
            for(HanhChinh hanhChinh: listNhanVien) {
                if(id.equals(hanhChinh.getId())) {//nếu tìm thấy thì gọi phương thức nhập để cập nhật lại thông tin
                    hanhChinh.nhap();
                    kt = false;//cho kt == false để thoát vòng lặp while vì đã tìm thấy nhân viên muốn cập nhật
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {//nhập lại nếu id không đúng
                System.out.println("Không tìm thấy mời nhập lại!");
            }
        }
    }
    private static void timTheoLuong() {
        double luongMax;
        double luongMin;
        while(true) {
            boolean kt = true;
            System.out.println("Nhập lương nv từ : "); luongMin = scanner.nextDouble();
            System.out.println(" Đến: "); luongMax = scanner.nextDouble();//nhập vào khoảng lương muốn tìm
            for(HanhChinh hanhChinh: listNhanVien) {
                if(hanhChinh.getLuong() <= luongMax && hanhChinh.getLuong() >= luongMin) {//nếu những nhân viên có trong khoảng lương này thì xuất ra thông tin
                    hanhChinh.xuatThongTin();
                    kt = false;//cho kt == false để thoát vì đã có nhân viên trong khoảng lương nhập vào
                }
            }
            if(kt == false) {
                break;
            } else {//nhập lại vì không có nhân viên trong khoảng lương nhập vào
                System.out.println("Không tìm thấy, mời nhập lại!");
            }
        }
    }

    private static void sapXepTheoHoTen() {
        Collections.sort(listNhanVien, new Comparator<HanhChinh>() {//sử dụng lớp tiện ích collection để sắp xếp
            @Override//gọi phương thức compare trong lớp Comparator để so sánh các tên của nhân viên
            public int compare(HanhChinh o1, HanhChinh o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        System.out.println("Sắp xếp thành công.");
    }

    private static void sapXepTheoThuNhap() {
        Collections.sort(listNhanVien, new Comparator<HanhChinh>() {//gọi lớp colecction để sắp xếp theo lương
            @Override//gọi phương thức compare để so sánh theo lương
            public int compare(HanhChinh o1, HanhChinh o2) {
                return o1.getLuong() > o2.getLuong()? 1: -1;
            }
        });//so sánh lương theo danh sách từ cao xuống thấp
        Collections.reverse(listNhanVien);
        System.out.println("Sắp xếp thành công.");
    }

    private static void xuatNVLuongCao() {
        sapXepTheoThuNhap();//gọi hàm sắp xếp để lấy danh sách nhân viên từ cao xuống thấp theo lương
        System.out.println("5 NHÂN VIÊN CÓ LƯƠNG CAO NHẤT.");
        for(int i = 0; i < 5; i++) {//xuất 5 nhân viên lương cao nhất
            listNhanVien.get(i).xuatThongTin();
        }
    }
}
