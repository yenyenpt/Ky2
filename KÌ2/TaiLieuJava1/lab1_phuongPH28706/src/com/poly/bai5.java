/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
import java.util.Scanner;


public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat: ");
        int st1 = sc.nextInt();
        
        System.out.print("Nhap so thu hai: ");
        int st2 = sc.nextInt();
        
        System.out.print("Nhap so thu ba: ");
        int st3 = sc.nextInt();
        
        System.out.println("Min: " + Math.min(Math.min(st1, st2),st3));
    }
    
}
