/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly;
import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap canh cua khoi lap phuong: ");
        double canh = sc.nextDouble();
        
        System.out.println("The tich cua khoi lap phuong = " + Math.pow(canh, 3));
            
    }
    
}
