/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1.java;

import java.util.Scanner;

/**
 *
 * @author yenyen
 */
public class Lab1Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name;
       double diemTrungBinh;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vui long nhap ho va ten: ");
        name = scanner.nextLine();
        System.out.printf("Vui long nhap diem cua ban: ");
        diemTrungBinh = scanner.nextDouble();
        System.out.println("--------------------------");
        System.out.println("Ho va ten cua ban la: " + name);
        System.out.println("Diem trung binh cua ban la: " + diemTrungBinh);
    }
    
}
