
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

    public class Lap5Bai2 {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String [] args) {
            menu();
        }
        private static void menu() {
            int chon;
            do {
                System.out.println("|Chức năng 01: Nhập.");
                System.out.println("|Chức năng 02: Xuất.");
                System.out.println("|Chức năng 03: Sắp xếp.");
                System.out.println("|Chức năng 04: Ngẫu nhiên.");
                System.out.println("|Chức năng 05: Xoá.");
                System.out.println("|Chức nănh 06: Thoát.");
                System.out.println("Nhập chức năng(1, 2, 3, 4, 5, 6): ");
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
                        sapXep();
                        break;
                    }
                    case 4: {
                        ngauNhien();
                        break;
                    }
                    case 5: {
                        xoa();
                        break;
                    }
                    case 6: {
                        System.exit(0);
                    }
                }
            }while(true);
        }
        static ArrayList<String> list = new ArrayList<String>();
        private static void nhap() {
            while(true) {
                String hoTen = scanner.nextLine();
                list.add(hoTen);
                System.out.println("Nhập tiếp(Y/N)?: ");
                String n = scanner.nextLine();
                if(n.equals("N")) {
                    break;
                }
            }
        }

        private static void xuat() {
            System.out.println("Danh sách họ tên vừa nhập là: ");
            for(String hoTen: list) {
                System.out.println(hoTen);
            }
        }

        private static void sapXep() {
            Collections.sort(list);
            Collections.reverse(list);
            System.out.println("Sắp xếp xong");
        }

        private static void ngauNhien() {
            Collections.shuffle(list);
            System.out.println("Ngẫu nhiên xong");
        }

        private static void xoa() {
            String hoVaTen;
            while(true) {
                scanner.nextLine();
                System.out.println("nhập họ tên muốn xoá.");
                hoVaTen = scanner.nextLine();
                boolean kt = true;
                for(String ten: list) {
                    if(hoVaTen.equals(ten)) {
                        list.remove(ten);
                        kt = false;
                        break;
                    }
                }
                if(kt == false) {
                    break;
                } else {
                    System.out.println("Không có tên trong danh sách.");
                }
            }
        }
    }
