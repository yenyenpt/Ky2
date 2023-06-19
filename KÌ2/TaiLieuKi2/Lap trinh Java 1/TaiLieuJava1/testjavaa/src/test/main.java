package test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<GiaoVien> listGV = new ArrayList<>();
    public static void main(String [] args) {
        menu();
    }

    private static void menu() {
        int chon;
        do {
            System.out.println("----------------------------------");
            System.out.println("|Chức năng 01: nhập              |");
            System.out.println("|Chức năng 02: xuất danh sách    |");
            System.out.println("|Chức năng 03: xuất theo tuổi    |");
            System.out.println("|Chức năng 04: tìm theo tên      |");
            System.out.println("|Chức năng 05: sắp xếp theo tên  |");
            System.out.println("|Chức năng 06: xoá theo tên      |");
            System.out.println("|Chức năng 07: kế thừa           |");
            System.out.println("|Chức năng 08: thoát             |");
            System.out.println("----------------------------------");
            System.out.println("Nhập chức năng: ");
            chon = scanner.nextInt();
            switch(chon) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    xuatDanhSach();
                    break;
                }
                case 3: {
                    xuatTheoTuoi();
                    break;
                }
                case 4: {
                    tim();
                    break;
                }
                case 5: {
                    sapXep();
                    break;
                }
                case 6: {
                    xoaTheoTen();
                    break;
                }
                case 7: {
                    keThua();
                    break;
                }
                case 8: {
                    System.exit(8);
                }
                default: {
                    System.out.println("Không có chức năng này!");
                }
            }
        }while(true);
    }

    private static void nhap() {
        while(true) {
            System.out.println("Nhập thông tin giáo viên: ");
            GiaoVien gv = new GiaoVien();
            gv.nhap();
            listGV.add(gv);
            scanner.nextLine();
            System.out.println("Nhập tiếp(y/n)? ");
            String n = scanner.nextLine();
            if(n.equals("n")) {
                break;
            }
        }
    }

    private static void xuatDanhSach() {
        System.out.println("***DANH SÁCH GÍAO VIÊN***");
        for(GiaoVien gv: listGV) {
            gv.xuat();
        }
    }

    private static void xuatTheoTuoi() {
        int min, max;
        boolean kt = true;
            System.out.print("bạn tìm tuổi từ: ");min = scanner.nextInt();
            System.out.println("đến: ");max = scanner.nextInt();
            for(GiaoVien gv: listGV) {
                if(gv.getAge() >= min && gv.getAge() <= max) {
                    gv.xuat();
                    kt = false;
                }
            }
            if(kt == true) {
                System.out.println("Không tìm thấy giao vien.");
            }
    }

    private static void tim() {
        boolean kt = true;
        scanner.nextLine();
        System.out.println("Nhập tên giáo viên muốn tìm: ");
        String name = scanner.nextLine();
        for(GiaoVien gv: listGV) {
            if(name.equals(gv.getName())) {
                gv.xuat();
                kt = false;
            }
        }
        if(kt == true) {
            System.out.println("không tìm thấy giáo viên");
        }
    }

    private static void sapXep() {
        Collections.sort(listGV, new Comparator<GiaoVien>() {
            @Override
            public int compare(GiaoVien o1, GiaoVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sắp xếp thành công.");
    }

    private static void xoaTheoTen() {
        boolean kt = true;
        System.out.println("Nhập tên muốn xoá: ");
        String name = scanner.nextLine();
        for(GiaoVien gv: listGV) {
            if(name.equals(gv.getName())) {
                listGV.remove(gv);
                kt = false;
            }
        }
        if(kt == true) {
            System.out.println("Không tìm thấy.");
        }
    }

    private static void keThua() {
        GiaoVien gvCoHuu = new GiaoVienCoHuu();
        gvCoHuu.setLuong(54433);
        gvCoHuu.setName("tuấn");
        gvCoHuu.setAge(45);
        gvCoHuu.xuat();
    }
}
