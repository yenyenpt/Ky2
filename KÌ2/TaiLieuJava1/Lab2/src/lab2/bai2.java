/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;




public class bai2 {
    public static void main(String[] args) {
        double delta;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();
        
        System.out.print("Nhap he  so c: ");
        double c = sc.nextDouble();
        
        if(a == 0){
            if(b == 0){
            if(c == 0){
                System.out.println("Phuong trinh co vo so nghiem!");
            }else{
                System.out.println("Phuong trinh vo nghiem!");  
            }
        }else{
            System.out.println("Phuong trinh co nghiem x = " + (-c/b));
        }
        }else{
            
            delta = Math.pow(b,2) - 4 * a * c;
            
            System.out.println("Delta  = " + delta);
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem!");
            }else if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep x = " + (-b/(2 * a)));
            }else{
                System.out.println("Phuong trinh co nghiem x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co nghiem x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
            }
             
        }
        
    }
    
}

