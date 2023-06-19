/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3.java;

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
        float theTich;
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Vui long nhap canh mot: ");
        canhMot = scanner.nextFloat();
        System.out.printf("Vui long nhap canh hai: ");
        canhHai = scanner.nextFloat();
        System.out.printf("Vui long nhap canh thu ba: ");
        canhBa = scanner.nextFloat();
        
        theTich = canhMot * canhHai * canhBa;
        System.out.printf("The tich: %.2f", theTich);
    }
    
}
