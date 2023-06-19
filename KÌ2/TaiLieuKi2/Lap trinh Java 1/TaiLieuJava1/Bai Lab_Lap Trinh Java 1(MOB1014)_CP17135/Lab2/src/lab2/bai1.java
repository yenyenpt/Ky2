/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap he so a: ");
        float a = sc.nextFloat();
        
        System.out.print("Nhap he so b: ");
        float b  = sc.nextFloat();
        
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh co vo so nghiem!");
            }else{
                System.out.println("Phuong trinh vo nghiem!");  
            }
        }else{
            System.out.println("Phuong trinh co nghiem x = " + (-b/a));
        }
    }
    
}

