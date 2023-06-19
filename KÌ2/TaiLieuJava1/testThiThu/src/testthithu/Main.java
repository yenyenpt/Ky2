package testthithu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<LaiMayBay> listMayBay = new ArrayList<>();

    public static void main(String[] args) {
        String passWord;
        String userName;
        do {
            System.out.println("Nhap username: ");
            userName = sc.nextLine();
            System.out.println("Nhap password: ");
            passWord = sc.nextLine();
            if (userName.equalsIgnoreCase("PolyHN") && passWord.equalsIgnoreCase("java1")) {
                menu();
            } else {
                System.out.println("Sai tài khoản hoặc mật khẩu. Nhập lại!");
            }
        } while (!(userName.equalsIgnoreCase("PolyHN") && passWord.equalsIgnoreCase("java1")));

//        String ktemail = "\\w+@\\w+(\\. \\w+){1,2}";
//        String ktsdt = "08\\d{8}";
//        String ktcmnd = "\\d{10}";
//        for (int i = 0; i < listMayBay.size(); i++) {
//            if (!listMayBay.get(i).getEmail().matches(ktemail)) {
//                System.out.println("email: " + listMayBay.get(i).getEmail() + " không đúng định dạng");
//            }
//            if (!listMayBay.get(i).getSdt().matches(ktsdt)) {
//                System.out.println("sdt : " + listMayBay.get(i).getSdt() + " không đúng định dạng");
//            }
//        }
    }

    private static void menu() {
        int chon;
        do {
            System.out.println("***--------------------------MENU------------------------***");
            System.out.println("|Chức năng 01: Nhập danh sách máy bay.                      |");
            System.out.println("|Chức năng 02: Xuất danh sách máy bay đã nhập.              |");
            System.out.println("|Chức năng 03: Xuất danh sách máy bay theo khoảng vòng 1.   |");
            System.out.println("|Chức năng 04: Tìm máy bay theo họ tên .                    |");
            System.out.println("|Chức năng 05: Tìm và sửa vòng 1 máy bay theo SĐT.          |");
            System.out.println("|Chức năng 06: Xóa 1 người theo SĐT.                        |");
            System.out.println("|Chức năng 07: Tìm tất cả máy bay có chữ Minh trong tên.    |");
            System.out.println("|Chức năng 08: Xuất tất cả các máy bay có họ Thánh.         |");
            System.out.println("|Chức năng 09: Sắp xếp từ lớn -&gt; bé theo vòng 1.         |");
            System.out.println("|Chức năng 10: In ra top 5 máy bay có vòng 1 to nhất.       |");
            System.out.println("|Chức nang 00: Thoát.                                       |");
            System.out.println("***------------------------------------------***");
            System.out.println("\nNhập chức năng: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    xuat();
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {

                    break;
                }
                case 5: {

                    break;
                }
                case 6: {

                    break;
                }
                case 7: {

                    break;
                }
                case 8: {

                    break;
                }
                case 9: {

                    break;
                }
                case 10: {
                    System.exit(10);
                }
            }
        } while (true);
    }

    private static void nhap() {
        int n;
        while (true) {
            LaiMayBay mayBay = new LaiMayBay();
            mayBay.nhap();
            listMayBay.add(mayBay);
            System.out.println("Nhập tiếp(1, 0)?: ");
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
        }
    }

    private static void xuat() {
        System.out.println("***THÔNG TIN MÁY BAY***\n");
        for (LaiMayBay mayBay : listMayBay) {
            mayBay.xuat();
        }
    }
}
