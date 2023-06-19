/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();
        
        System.out.print("Nhap diem: ");
        double score = sc.nextDouble();
        
        System.out.println("Ho ten: " + name + " - Diem: " + score);
        
      
    }
}
