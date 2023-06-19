
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<HanhChinh> listNhanVien = new ArrayList<>();
    public static void main(String [] args) {
        menu();
    }

    private static void menu() {
        int chon;
        do {
            System.out.println("***--------------------MENU------------------***");
            System.out.println("|Cn 01: nhập                     |");
            System.out.println("|Cn 02: xuất                     |");
            System.out.println("|Cn 03: tìm theo id              |");
            System.out.println("|Cn 04: xóa theo id              |");
            System.out.println("|Cn5 05: cập nhập thông tin theo mã  |");
            System.out.println("|Cn 06: tìm theo lương nv        |");
            System.out.println("|Cn 07: sắp xếp theo họ tên      |");
            System.out.println("|Cn 08: sắp xếp theo thu nhập    |");
            System.out.println("|Cn 09: xuất 5 nv lương cao nhấ  |");
            System.out.println("|Cn 10: thoát                    |");
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
        while(true) {
            System.out.println("Mời bạn chọn 1: Hành Chính, 2:Tiếp Thị,3:Trưởng Phòng,4:Thoát");
            chon = scanner.nextInt();
            if(chon ==1){
             System.out.println("Nhập Thông tin nhân viên hành chính: ");
             while(true){
            HanhChinh hanhChinh = new HanhChinh();
            hanhChinh.nhap();
            listNhanVien.add(hanhChinh);
            System.out.println("nhập tiếp(1, 0): "); n = scanner.nextInt();
            if(n == 0) {
                break;
            }
        }
        }
            if(chon==2){
        System.out.println("Nhập Thông tin nhân viên tiếp thị: ");
        while(true) {
            TiepThi tiepThi = new TiepThi();
            tiepThi.nhap();
            listNhanVien.add(tiepThi);
            System.out.println("Nhập tiếp(1, 0): "); n = scanner.nextInt();
            if(n == 0) {
                break;
            }
        }
            }
        if(chon==3){
        System.out.println("Nhập Thông tin nhân viên trưởng phòng.");
        while(true) {
            TruongPhong truongPhong = new TruongPhong();
            truongPhong.nhap();
            listNhanVien.add(truongPhong);
            System.out.println("Nhập tiếp(1, 0): "); n = scanner.nextInt();
            if(n == 0) {
                break;
            }
        }
        }
        if(chon==4){
            break;
        }
        }
}

    private static void xuat() {
        System.out.println("***Thông tin nhân viên***\n");
        for(HanhChinh HC: listNhanVien) {
            HC.xuatThongTin();
        }
    }
    

    private static void timtheoId() {
        String id;
        while(true) {
            scanner.nextLine();
            System.out.println("Nhập mã nv muốn tìm ");
            id = scanner.nextLine();
            boolean kt = true;
            for(HanhChinh hanhChinh: listNhanVien) {
                if(id.equals(hanhChinh.getId())) {
                    hanhChinh.xuatThongTin();
                    kt = false;
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("không tìm thấy mã nv này!");
            }
        }
    }

    private static void xoaTheoId() {
        String id;
        while(true) {
            scanner.nextLine();
            System.out.println("Nhập mã nhân viên muốn xóa: ");
            id = scanner.nextLine();
            boolean kt = true;
            for(HanhChinh hanhChinh: listNhanVien) {
                if(id.equals(hanhChinh.getId())) {
                    listNhanVien.remove(hanhChinh);
                    System.out.println("xóa thành công.");
                    kt = false;
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("không tìm thấy mã nhân viên muốn xóa!");
            }
        }
    }

    private static void capNhatTheoId() {
        String id;
        while(true) {
            scanner.nextLine();
            System.out.println("Nhập mã nv muốn cập nhập: ");
            id = scanner.nextLine();
            boolean kt = true;
            for(HanhChinh hanhChinh: listNhanVien) {
                if(id.equals(hanhChinh.getId())) {
                    hanhChinh.nhap();
                    kt = false;
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("không tìm thấy mã nv muốn cập nhập!");
            }
        }
    }
    private static void timTheoLuong() {
        double luong;
        while(true) {
            boolean kt = true;
            System.out.println("Nhập Lương nv: ");
            luong = scanner.nextDouble();
            for(HanhChinh hanhChinh: listNhanVien) {
                if(hanhChinh.getLuong() == luong) {
                    hanhChinh.xuatThongTin();
                    kt = false;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("không tìm thấy lương nv!");
            }
        }
    }

    private static void sapXepTheoHoTen() {
        Collections.sort(listNhanVien, new Comparator<HanhChinh>() {
            @Override
            public int compare(HanhChinh o1, HanhChinh o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        System.out.println("sắp xếp the họ tên");
    }

    private static void sapXepTheoThuNhap() {
        Collections.sort(listNhanVien, new Comparator<HanhChinh>() {
            @Override
            public int compare(HanhChinh o1, HanhChinh o2) {
                return o1.getLuong() > o2.getLuong()? 1: -1;
            }
        });
        Collections.reverse(listNhanVien);
        System.out.println("Sắp xếp theo thu nhập nv.");
    }

    private static void xuatNVLuongCao() {
        sapXepTheoThuNhap();
        System.out.println("5 Nhân viên lương cao nhất là:");
        for(int i = 0; i < 5; i++) {
            listNhanVien.get(i).xuatThongTin();
        }
    }
}
        
    
    

