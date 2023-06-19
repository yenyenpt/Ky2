package ASM1;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args) {
        menu();
    }
    private static void menu() {
        int chon;
        do{
            System.out.println("***---------------------------------------***");
            System.out.println("|Chức năng 01: Nhập.                        |");
            System.out.println("|Chức năng 02: Xuất.                        |");
            System.out.println("|Chức năng 03: Tìm NV                       |");
            System.out.println("|Chức năng 04: Xoá NV                       |");
            System.out.println("|Chức năng 05: Cập nhật NV                  |");
            System.out.println("|Chức năng 06: Thoát                        |");
            System.out.println("***---------------------------------------***");
            System.out.println("Chọn chức năng(1, 2, 3, 4, 5, 6): ");
            chon = scanner.nextInt();
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
                    timNV();
                    break;
                }
                case 4: {
                    xoaNV();
                    break;
                }
                case 5: {
                    capNhatNV();
                    break;
                }
                case 6: {
                    System.exit(6);
                }
                default: System.out.println("Nhập lại!");
            }
        }while(true);
    }
    static ArrayList<HanhChinh> listNhanVien = new ArrayList<>();
    private static void nhap() {
        int n;
        System.out.println("Nhập thông tin nhân viên hành chính: ");
        while(true) {
            HanhChinh hanhChinh = new HanhChinh();
            hanhChinh.nhap();
            listNhanVien.add(hanhChinh);
            System.out.println("Nhập tiếp(1, 0)?: ");
            n = scanner.nextInt();
            if(n == 0) {
                break;
            }
        }
        System.out.println("Nhập thông tin nhân viên tiếp thị: ");
        while(true) {
            TiepThi tiepthi = new TiepThi();
            tiepthi.nhap();
            listNhanVien.add(tiepthi);
            System.out.println("Nhập tiếp(1, 0)?: ");
            n = scanner.nextInt();
            if(n == 0) {
                break;
            }
        }
        System.out.println("Nhập thông tin nhân vien trưởng phòng: ");
        while(true) {
            TruongPhong truongphong = new TruongPhong();
            truongphong.nhap();
            listNhanVien.add(truongphong);
            System.out.println("Nhập tiếp(1, 0)?: ");
            n = scanner.nextInt();
            if(n == 0) {
                break;
            }
        }
    }

    private static void xuat() {
        System.out.println("***Thông tin toàn bộ nhân viên***");
        for(HanhChinh nhanvien: listNhanVien) {
            nhanvien.xuatThongTin();
        }
    }

    private static void timNV() {
        String id;
        while(true) {
            boolean kt = true;
            System.out.println("Nhập mã nhân viên muốn tìm: ");
            scanner.nextLine();
            id = scanner.nextLine();
            for(HanhChinh nhanvien: listNhanVien) {
                if(id.equals(nhanvien.getId())) {
                    nhanvien.xuatThongTin();
                    kt = false;
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("Nhập lại.");
            }
        }
    }

    private static void xoaNV() {
        boolean kt = true;
        while(true) {
            System.out.println("Nhập mã nhận viên muốn xoá: ");
            scanner.nextLine();
            String id = scanner.nextLine();
            for(int i = 0; i < listNhanVien.size(); i++) {
                if(id.equals(listNhanVien.get(i).getId())) {
                    listNhanVien.remove(listNhanVien.get(i));
                    kt = false;
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("Nhập lại.");
            }
        }
    }

    private static void capNhatNV() {
        boolean kt = true;
        while(true) {
            System.out.println("Nhập mã nhận viên cập nhật: ");
            scanner.nextLine();
            String id = scanner.nextLine();
            for(int i = 0; i < listNhanVien.size(); i++) {
                if(id.equals(listNhanVien.get(i).getId())) {
                    listNhanVien.set(i, listNhanVien.get(i));
                    System.out.println("nhập thông tin cần cập nhật.");
                    listNhanVien.get(i).nhap();
                    kt = false;
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("Nhập lại.");
            }
        }
    }
}

