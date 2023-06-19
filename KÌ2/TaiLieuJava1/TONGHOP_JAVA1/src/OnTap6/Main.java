/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap6;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choice;
        QuanLyChuyenNganh chucNang = new QuanLyChuyenNganh();
        
        do{
            System.out.println("---------------------------");
            System.out.println("\t\tMENU");
            System.out.println("1.Nhap danh sach chuyen nganh");
            System.out.println("2.Xuat danh sach chuyen nganh");
            System.out.println("3.Tim chuyen nganh theo ma");
            System.out.println("4.Xoa chuyen nganh theo ma");
            System.out.println("5.Sap xep danh sach chuyen nganh theo so giang vien");
            System.out.println("6.Ke thua");
            System.out.println("0.Thoat");
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
                    chucNang.lookFor();
                    break;
                case 4:
                    chucNang.delete();
                    break;
                case 5:
                    chucNang.arrange();
                    break;
                case 6:
                    chucNang.keThua();
                    break;
                case 0:
                    System.out.println("Thoat!!");
                    break;
                default:
                    System.out.println("Nhap sai, vui long nhap lai!");
                    break;
                    
            }
        }while(choice != 0);
        
    }
    
}
