/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap1_SinhVien;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Integer choice;
        QLSV chucNang = new QLSV();
        
        do{
            System.out.println("------------------------");
            System.out.println("\t\t\t MENU");
            System.out.println("1.Nhap danh sach doi tuong");
            System.out.println("2.Xuat danh sach doi tuong");
            System.out.println("3.Tim sinh vien theo ma");
            System.out.println("4.Sap xep danh sach cac sinh vien theo thuoc tinh chuyen nganh");
            System.out.println("5.Khoi tao thong tin sinh vien Poly");
            System.out.println("6.Xoa sinh vien theo ma");
            System.out.println("0.Thoat");
            System.out.println("Xin moi chon: ");
            choice = sc.nextInt();
            System.out.println("------------------------");
            
            
            switch(choice){
                case 1:
                    chucNang.input();
                    break;
                case 2:
                    chucNang.output();
                    break;
                case 3:
                    chucNang.timKiem();
                    break;
                case 4:
                    chucNang.sapXep();
                    break;
                case 5:
                    chucNang.keThua();
                    break;
                case 6:
                    chucNang.delete();
                    break;
                case 0:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Nhap sai, vui long nhap lai!!");
                    break;
                 
            } 
        }while(choice != 0);
    }
}
