import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class Lap5Bai3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args) {
        menu();
    }

    private static void menu() {
        int chon;
        do{
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("|Chức năng 01: nhập           |");
            System.out.println("|Chức năng 02: sắp xếp        |");
            System.out.println("|Chức năng 03: xoá theo tên   |");
            System.out.println("|Chức năng 04: xuất gia trung |");
            System.out.println("|Chức năng 05: thoát          |");
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Nhập chức năng: ");
            chon = scanner.nextInt();
            switch(chon) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    sapxep();
                    break;
                }
                case 3: {
                    tim();
                    break;
                }
                case 4: {
                    trungbinh();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default: {
                    System.out.println("không có chức năng này!");
                }
            }
        }while(true);
    }
    static ArrayList <SanPham> listSP = new ArrayList<>();
    private static void nhap() {
        System.out.println("Nhập thông tin san pham: ");
        while(true) {
            SanPham sp = new SanPham();
            sp.nhap();
            listSP.add(sp);
            System.out.println("Nhâp tiếp(Y/N)?: ");
            String n = scanner.nextLine();
            if(n.equals("N")) {
                break;
            }
        }
    }

    private static void sapxep() {
        Collections.sort(listSP, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getGia() > o2.getGia()? 1 : -1;
            }
        });
    }

    private static void tim() {
        while(true) {
            scanner.nextLine();
            boolean kt = true;
            System.out.println("Nhập tên sản phẩm muốn xoá: ");
            String name = scanner.nextLine();
            for(SanPham sp: listSP) {
                if(name.equals(sp.getName())) {
                    listSP.remove(sp);
                    System.out.println("xoá thành công.");
                    kt = false;
                    break;
                }
            }
            if(kt == false) {
                break;
            } else {
                System.out.println("không tìm thấy sản phẩm.");
            }
        }
    }

    private static void trungbinh() {
        double sum = 0;
        for(SanPham sp: listSP) {
            sum += sp.getGia();
        }
        double trungBinh = sum / listSP.size();
        System.out.println("Giá trung bình là: " + trungBinh);
    }
}
