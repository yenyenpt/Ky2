/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tonghop;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        QLHH chucNang = new QLHH();
        
        do{
            System.out.println("--------------------------------");
            System.out.println("\t\tMENU");
            System.out.println("1.Nhập danh sách hàng");
            System.out.println("2.Xuất danh sách");
            System.out.println("3.Cập nhật lại thông tin hàng theo mã nhập từ bàn phím");
            System.out.println("4.Tìm hàng theo tên nhập vào");
            System.out.println("5.Sắp xếp hàng theo tên giảm dần");
            System.out.println("6.Xoá hàng theo mã nhập vào");
            System.out.println("7.Tìm hàng có đơn giá lớn nhất");
            System.out.println("8.Tìm hàng theo khoảng số lượng nhập vào");
            System.out.println("9.Kế thừa");
            System.out.println("10.Thoát");
            
            System.out.println("Mời chọn chức năng: ");
            choice = sc.nextInt();
            System.out.println("---------------------------------");
            
            switch(choice){
                case 1:
                    chucNang.chucNang1();
                    break;
                case 2:
                    chucNang.chucNang2();
                    break;
                case 3:
                    chucNang.chucNang3();
                    break;
                case 4:
                    chucNang.chucNang4();
                    break;
                case 5:
                    chucNang.chucNang5();
                    break;
                case 6:
                    chucNang.chucNang6();
                    break;
                case 7:
                    break;
                case 8:
                    chucNang.chucnang8();
                    break;
                case 9:
                    chucNang.chucNang9();
                    break;
                case 10:
                    System.out.println("Thoat!!!");
                    break;
                default:
                    System.out.println("Khong tim thay chuc nang ban muon!");
                    break;
              
            }
            
        }while(choice != 0);
    }
}
