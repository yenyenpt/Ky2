/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao so dien da su dung: ");
        double soDien = sc.nextDouble();
        
        if(soDien < 0 && soDien <= 50){
            System.out.println("Gia moi so dien la 1000");
            System.out.println("So tien dien ban phai dong la: " + soDien * 1000);
            
        }else{
            System.out.println("Gia moi so dien la 1200");
            System.out.println("So tien dien ban phai dong la: " + ((50* 1000)+ (soDien - 50) * 1200));
        } 
    }
    
}



