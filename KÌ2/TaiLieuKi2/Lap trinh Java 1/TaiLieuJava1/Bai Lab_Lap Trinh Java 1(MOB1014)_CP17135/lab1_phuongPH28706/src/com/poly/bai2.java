/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();
        
        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();
         
        double chuVi, dienTich;
        
        chuVi = (dai + rong) * 2;
        dienTich = dai * rong;
        
        System.out.println("Chu vi hinh chu nhat = " + chuVi);
        System.out.println("Dien tich hinh chu nhat = " + dienTich);
        System.out.println("Canh co do dai nho nhat = " + Math.min(dai,rong));
                        
        
    }
    
}
