/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap5_Phong;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice;
        QuanLiPhong chucNang = new QuanLiPhong();
        
        do{
            System.out.println("------------------------");
            System.out.println("\t\tMENU");
            System.out.println("1.Nhap danh sach doi tuong");
            System.out.println("2.Xuat danh sach phong");
            System.out.println("3.Xuat danh sach phong theo trang thai");
            System.out.println("4.Xuat dannh sach phong dang hoat dong theo khoang dien tich");
            System.out.println("Moi chon: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    chucNang.input();
                    break;
                case 2:
                    chucNang.output();
                    break;
                case 3:
                    chucNang.out();
                    break;
                default:
                    System.out.println("Moi chon lai!!");
                    break;
            }
            
        }while(choice != 0);
        
    }
    
}
