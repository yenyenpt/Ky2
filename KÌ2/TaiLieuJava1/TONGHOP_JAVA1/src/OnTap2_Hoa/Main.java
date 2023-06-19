/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap2_Hoa;

import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Integer choice;
        QuanLiHoa chucNang = new QuanLiHoa();
        
        do{
            System.out.println("----------------------------");
            System.out.println("\t\tMENU");
            System.out.println("1.Nhap thong tin hoa");
            System.out.println("2.Xuat danh sach hoa");
            System.out.println("3.Xoa hoa theo ID");
            System.out.println("4.Sap xep danh sach hoa giam dan theo ID");
            System.out.println("5.Khoi tao doi tuong hoa hong");
            System.out.println("0.Thoat");
            System.out.println("Moi chon: ");
            choice = sc.nextInt();
            System.out.println("-----------------------------");
            
            switch(choice){
                case 1:
                    chucNang.input();
                    break;
                case 2:
                    chucNang.output();
                    break;
                case 3:
                    chucNang.delete();
                    break;
                case 4:
                    chucNang.arrange();
                    break;
                case 0:
                    System.out.println("Thoat!");
                    break;
                    
                case 5:
                    chucNang.keThua();
                    break;
                default:
                    System.out.println("Nhap sai vui long nhap lai!!");
                    break;
            }
           
        }while(choice != 0);
        
    }
    
}
