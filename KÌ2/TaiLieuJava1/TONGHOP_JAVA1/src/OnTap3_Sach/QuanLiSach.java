/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap3_Sach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class QuanLiSach {
    private static final Scanner sc = new Scanner(System.in);
    public ArrayList<Sach> QLS = new ArrayList<>();
    
    
   
    public void input(){
        while(true){
            System.out.println("Nhap thong tin sach");
            Sach sach = new Sach();
            sach.nhapSach();
            QLS.add(sach);
            
            String nhapTiep;
            while(true){
                System.out.println("Ban co muon nhap tiep hay khong(Y-N): ");
                nhapTiep = sc.nextLine();
                if(!nhapTiep.equalsIgnoreCase("Y") && (!nhapTiep.equalsIgnoreCase("N"))){
                    System.out.println("Nhap sai, moi nhap lai!!");
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
        for(int i = 0; i < QLS.size(); i++){
            System.out.println("Sach thu " + (i+1));
            QLS.get(i).hienSach();
        }
    }
    
    public void lookFor(){
        System.out.println("Nhap ma sach ban muon tim: ");
        String maSach = sc.next();
        int soDem = 0;
        for(int i = 0; i < QLS.size(); i++){
            if(maSach.equals(QLS.get(i).getMaSach())){
                QLS.get(i).hienSach();
                soDem = 1;
                break; 
            }
        }
        if(soDem == 0){
            System.out.println("Khong tim thay ma sach ban muon tim!");
        }
    }
    public void arrange(){
        Collections.sort(QLS, new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
              return o1.getGia() > o2.getGia() ? -1 : 1;
            }
            
        });

        System.out.println("Danh sach sau khi sap xep");
        for(int i = 0; i < QLS.size(); i++){
            QLS.get(i).hienSach();
        }
    }
    public void keThua(){
        TapChi newSach = new TapChi();
        System.out.println("Xin moi nhap thong tin");
        newSach.nhapSach();
        System.out.println("Thong tin sau khi nhap");
        newSach.hienSach();
        
    }
}
