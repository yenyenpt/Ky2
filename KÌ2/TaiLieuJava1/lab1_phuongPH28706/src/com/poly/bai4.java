/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
import java.util.Scanner;


public class bai4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();
        
        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();
        
        double delta = Math.pow(b, 2) - (4 * a * c);
        
        System.out.println("Delta = " + delta);
        System.out.println("Can cua delta = " + Math.sqrt(delta));
        
    }  
       
}
