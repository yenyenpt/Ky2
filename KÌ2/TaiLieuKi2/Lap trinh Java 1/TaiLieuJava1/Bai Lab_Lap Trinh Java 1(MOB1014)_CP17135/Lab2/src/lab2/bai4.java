/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;


public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int choice;
        
        do {
            System.out.println("+----------------------------+");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac  2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Exit");
            System.out.println("+----------------------------+");
            
            System.out.println("Moi chon: ");
            choice = sc.nextInt();
            
            
            switch(choice){
                case 1 -> {
                   
                    System.out.println("Nhap he so a: ");
                    float a = sc.nextFloat();

                    System.out.println("Nhap he so b: ");
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
                
                case 2 -> {
                    double delta;
                    
                    System.out.println("Nhap he so a: ");
                    double a = sc.nextDouble();
                    
                    System.out.println("Nhap he so b: ");
                    double b = sc.nextDouble();
                    
                    System.out.println("Nhap he  so c: ");
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
                
                case 3 -> {
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
                
                case 4 -> {
                    System.out.println("Exit!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Moi nhap lai!!!");
                    break;
                }             
            }
            
        }while(choice != 0);
       
           
    }
    
    
}
