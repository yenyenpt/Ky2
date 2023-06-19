import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Lap7Bai2_3_4 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SinhVienPoLy> listSV = new ArrayList<>();
    public static void main(String [] args) {
        menu();
    }

    private static void menu() {
        int chon;
        do{
            System.out.println("------------------------------------");
            System.out.println("|Chức năng 01: Nhập                 ");
            System.out.println("|Chức năng 02: Xuất                 ");
            System.out.println("|Chức năng 03: Xuất sv học giỏi     ");
            System.out.println("|Chức năng 04: Sắp xếp theo điểm    ");
            System.out.println("|Chức năng 05: Thoát                ");
            System.out.println("------------------------------------");
            System.out.println("Nhập vào chức năng(1, 2, 3, 4, 5): ");
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
                    xuatSVGioi();
                    break;
                }
                case 4: {
                    sapXep();
                }
                case 5: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Khong co chuc nang này mới nhập lại!");
                }
            }
        }while(true);
    }

    private static void nhap() {
        int chon;
        while(true) {
            System.out.println("Mời bạn nhập loại sinh viên 1: IT, 2: maketing"); chon = scanner.nextInt();
            switch(chon) {
                case 1: {
                    SinhVienIT it = new SinhVienIT();
                    it.nhap();
                    listSV.add(it);
                }
            }
        }
    }

    private static void xuat() {

    }

    private static void xuatSVGioi() {

    }

    private static void sapXep() {

    }
}
