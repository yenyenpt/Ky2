/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2.java;

import java.util.Scanner;

/**
 *
 * @author yenyen
 */
public class java {
   public static void main(String[] args) {
       double chieuDai, chieuRong, chuVi, dienTich;
       Scanner scanner = new Scanner(System.in);
       System.out.printf("Vui long nhap chieu dai: ");
       chieuDai = scanner.nextDouble();
       System.out.printf("Vui long nhap chieu rong: ");
       chieuRong = scanner.nextDouble();
       
       chuVi = (chieuDai + chieuRong) * 2;
       dienTich = chieuDai * chieuRong;
       
       System.out.printf("Chu vi : %.2f\n", chuVi);
       System.out.printf("Dien tich: %.2f\n", dienTich);
       System.out.printf("Canh nho nhat: %.2f", Math.min(chieuDai, chieuRong));
       
   
   }
    
    
}
