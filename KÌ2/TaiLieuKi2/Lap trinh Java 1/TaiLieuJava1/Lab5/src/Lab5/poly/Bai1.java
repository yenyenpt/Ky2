/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.poly;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class Bai1 {
    private final ArrayList<Double> list = new ArrayList<>();
    
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap danh sach so thuc");
        while (true) {
            System.out.print("Nhap so: ");
            Double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.print("Nhap tiep du lieu (Y/N): ");
            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
        
    }
    
    public void hienThi(){
        System.out.println("----------------------------");
        for(Double item : list){
            System.out.println(" " + item);
        }
    }
        
    public void tinhTong(){
        double tong = 0;
        for(Double item : list){
            tong += item;
        }
        System.out.println();
        System.out.println("Tong: " + tong);
    }
    
}
