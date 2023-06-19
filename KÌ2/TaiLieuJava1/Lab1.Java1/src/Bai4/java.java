/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author yenyen
 */
public class java {
    public static void main(String[] args) {
        float canhMot;
        float canhHai;
        float canhBa;
      
     Scanner scanner = new Scanner(System.in);
      System.out.printf("Vui long nhap canh mot: ");
        canhMot = scanner.nextFloat();
        
        System.out.printf("Vui long nhap canh hai: ");
        canhHai = scanner.nextFloat();
        
        System.out.printf("Vui long nhap canh thu ba: ");
        canhBa = scanner.nextFloat();
        
        float delta = (float) Math.pow(canhHai,2)-(4 * canhMot * canhBa);
        System.out.println("Can delta la: "+Math.sqrt(delta));
        
     
        
    }
    
}
