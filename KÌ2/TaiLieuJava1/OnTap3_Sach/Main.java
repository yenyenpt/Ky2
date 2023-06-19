/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap3_Sach;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int choose;
        QuanLiSach chucNang = new QuanLiSach();
        do{
         
            System.out.println("-------------------------------");
            System.out.println("\t\tMENU");
            System.out.println("1.Nhap thong tin sach");
            System.out.println("2.Xuat thong tin sach");
            System.out.println("3.Tim thong tin sach theo ma");
            System.out.println("4.Sap xep danh sach theo gia");
            System.out.println("5.Khoi tao thong tin sach");
            System.out.println("0.Thoat");
            System.out.println("-------------------------------");
            System.out.println("Moi chon: ");
            choose = sc.nextInt();
            
            
            switch(choose){
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
                    chucNang.arrange();
                    break;
                case 5:
                    chucNang.keThua();
                    break;
                case 0:
                    System.out.println("Thoat!!");
                    break;
                default:
                    System.out.println("Nhap sai moi nhap lai!!");
                    break;
            }  
        }while(choose != 0);
        
    }
}
