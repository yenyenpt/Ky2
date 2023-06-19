/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap5_Phong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class QuanLiPhong {
    private static final Scanner sc = new Scanner(System.in);
    private final  ArrayList<Phong> QLP;
    public QuanLiPhong(){
        QLP = new ArrayList();
    }
    
    public void input(){
        while(true){
            System.out.println("Nhap thong tin phong");
            System.out.println("Ten phong: ");
            String ten = sc.next();
            System.out.println("Dien tich: ");
            double dienTich = sc.nextDouble();
            int trangThai;
            while(true){
            System.out.println("Trang thai[1 - hoat dong; 2 - khong hoat dong]: ");
            trangThai = sc.nextInt();
            if(trangThai != 1  && trangThai != 2){
                System.out.println("Nhap sai, moi nhap lai( 1 hoac 2)");
            }else{
                break;
            }
            
            }
            QLP.add(new Phong(ten, dienTich, trangThai));
            String nhapTiep;
            while(true){
                System.out.println("Ban co muon nhap tiep hay khong[Y-N]: ");
                nhapTiep = sc.next();
                if(!nhapTiep.equalsIgnoreCase("Y") && (!nhapTiep.equalsIgnoreCase("N"))){
                    System.out.println("Nhap sai moi nhap lai!!");
                }else{
                    break;
                }
            }
            if(nhapTiep.equalsIgnoreCase("Y")){
                continue;
            }else{
                break;
            }
        }
    }
    public void output(){
        System.out.println("Danh sach sau khi nhap");
        
        for(int i = 0; i < QLP.size(); i++){
            System.out.println("Phong thu " + (i + 1));
            QLP.get(i).inThongTin();
        }
    }
    
    public void out(){
        System.out.println("Moi ban nhap trang thai muon xuat: ");
        int trangThai = sc.nextInt();
        int soDem = 0;
        for(int i = 0; i < QLP.size(); i++){
            if(trangThai == QLP.get(i).getTrangThai()){
                QLP.get(i).inThongTin();
                soDem ++;
            }
        }
        if(soDem == 0){
            System.out.println("Khong co thong tin!!");
        }
    }
    
    public void keThua(){
        System.out.println("Nhap thong tin phong hoc");
            System.out.println("Ten phong: ");
            String ten = sc.next();
            System.out.println("Dien tich: ");
            double dienTich = sc.nextDouble();
            int trangThai;
            while(true){
            System.out.println("Trang thai[1 - hoat dong; 2 - khong hoat dong]: ");
            trangThai = sc.nextInt();
            if(trangThai != 1  && trangThai != 2){
                System.out.println("Nhap sai, moi nhap lai( 1 hoac 2)");
            }else{
                break;
            }
            
            }
            int loaiPhong;
            while(true){
            System.out.println("Loai phong[1 - phong lab; 2 - phong hoc]: ");
            loaiPhong = sc.nextInt();
            if(loaiPhong != 1  && loaiPhong != 2){
                System.out.println("Nhap sai, moi nhap lai( 1 hoac 2)");
            }else{
                break;
            }
            
            }
            QLP.add(new Phong(ten, dienTich,trangThai));
            
        
    }
    
    
    
    
    
    
}
