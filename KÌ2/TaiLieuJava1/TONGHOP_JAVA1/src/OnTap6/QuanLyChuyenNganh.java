/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class QuanLyChuyenNganh {
    private static final Scanner sc = new Scanner(System.in);
    public ArrayList<ChuyenNganh> QLCN = new ArrayList();
    
    public void input(){
        while(true){
            System.out.println("Nhap thong tin chuyen nganh");
            ChuyenNganh chuyennganh = new ChuyenNganh();
            chuyennganh.nhapThongTin();
            QLCN.add(chuyennganh);
            
            String nhapTiep;
            while(true){
                System.out.println("Ban co muon nhap tiep hay khong[Y-N]: ");
                nhapTiep = sc.next();
                if(!nhapTiep.equalsIgnoreCase("Y") && (!nhapTiep.equalsIgnoreCase("N"))){
                    System.out.println("Nhap sai vui long nhap lai!!");
                    
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
        System.out.println("Thong tin chuyen nganh sau khi nhap");
        for(int i = 0; i < QLCN.size(); i++){
            QLCN.get(i).inThongTin();
        }
    }
    
    public void lookFor(){
        System.out.println("Nhap ma chuyen nganh can tim: ");
        int maChuyenNganh = sc.nextInt();
        int soDem = 0;
        for(int i = 0; i < QLCN.size(); i++){
            if(maChuyenNganh == QLCN.get(i).getMaChuyenNganh()){
                QLCN.get(i).inThongTin();
                soDem = 1;
            }
        }
        if(soDem == 0){
            System.out.println("Khong tim thay ma chuyen nganh can tim!!");
        }
    }
    
    public void delete(){
        System.out.println("Nhap ma chuyen nganh can xoa: ");
        int maChuyenNganh = sc.nextInt();
        int soDem = 0;
        for(int i = 0; i < QLCN.size(); i++){
            if(maChuyenNganh == QLCN.get(i).getMaChuyenNganh()){
                QLCN.remove(i);
                soDem = 1;
            }
        }
        if(soDem == 0){
            System.out.println("Khong tim thay ma chuyen nganh muon xoa!!");
        }else{
            System.out.println("Danh sach chuyen nganh sau khi xoa");
            for(int i = 0; i < QLCN.size(); i++){
                QLCN.get(i).inThongTin();
            }
        }
    }
    
    public void arrange(){
        Collections.sort(QLCN, new Comparator<ChuyenNganh>(){
        @Override
        public int compare(ChuyenNganh o1, ChuyenNganh o2) {
            return o1.getSoGiangVien() > o2.getSoGiangVien() ? -1 : 1;
        }
    });
    System.out.println("Danh sach sau khi sap xep");
    for(int i = 0; i < QLCN.size(); i++){
        QLCN.get(i).inThongTin();
    }
    }
    
    public void keThua(){
        ChuyenNganhJava newChuyenNganh = new ChuyenNganhJava();
        System.out.println("Nhap thong tin: ");
        newChuyenNganh.nhapThongTin();
        System.out.println("Thong tin sau khi nhap: ");
        newChuyenNganh.inThongTin();
    }
    
}
