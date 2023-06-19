/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Integer choice;
        QLSV chucnang = new QLSV();
        
        
        do{
            System.out.println("-----------------------------");
            System.out.println("\t\t\tMENU");
            System.out.println("1. Nhap danh sach doi tuong");
            System.out.println("2. Xuat danh sach doi tuong");
            System.out.println("3. Tim sinh vien theo ma");
            System.out.println("4. Sap xep danh sach cac sinh vien theo thuoc tinh chuyen nganh");
            System.out.println("0. Thoat");
            
            System.out.println("Moi chon: ");
            choice = sc.nextInt();
            System.out.println("-----------------------------");
            
            switch(choice){
                case 1:
                    chucnang.input();
                    break;
                case 2:
                    chucnang.output();
                    break;
                case 3:
                    chucnang.lookFor();
                    break;
                case 0:
                    System.out.println("Exit!");
                    break;
                default:
                    System.out.println("Nhap sai, vui long nhap lai^^");
                    break;
                   
            }
            
            
        }while( choice != 0);
        
    }
}
