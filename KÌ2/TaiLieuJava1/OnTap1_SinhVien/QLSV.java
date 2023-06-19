/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap1_SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class QLSV {
    private static final Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVien> dssv = new ArrayList();
    
    Integer soLuong;
    
    public void input(){
        while(true){
        
            System.out.println("Nhap thong tin sinh vien");
            SinhVien sinhvien = new SinhVien();
            sinhvien.nhapThongTin();
            dssv.add(sinhvien);
           
         
        String nhapTiep;
        while(true){
            System.out.println("Ban co muon nhap tiep hay khong(Y-N): ");
            nhapTiep = sc.next();
            if(!nhapTiep.equalsIgnoreCase("Y") && !nhapTiep.equalsIgnoreCase("N")){
                System.out.println("Xin moi nhap lai ");
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
        for(Integer i = 0; i < dssv.size(); i++){
            System.out.println("Sinh vien thu " + (i+1));
            dssv.get(i).inThongTin();
            
        }
        
    }
    
    public void timKiem(){
        System.out.println("Nhap ma sinh vien muon tim: ");
        String maSV = sc.next();
        Integer soDem = 0;
        for(Integer i = 0; i < dssv.size(); i++){
           
            if(maSV.equals(dssv.get(i).getMaSv())){
            dssv.get(i).inThongTin();
            soDem = 1;
            break;
            }
        }
        if(soDem == 0){
            System.out.println("Khong tim thay ma ban can!");
        }
    }
    public void delete(){
        System.out.println("Nhap ma sinh vien muon xoa: ");
        String maSV = sc.next();
        Integer soDem = 0;
        for(int i = 0; i < dssv.size(); i++){
            if(maSV.equals(dssv.get(i).getMaSv())){
                dssv.remove(i);
                soDem = 1;
                break;
            }
        }
        if(soDem == 0){
            System.out.println("Khong tim thay ma sinh vien ban muon xoa!!");
        }else{
            System.out.println("Danh sach sinh vien sau khi xoa");
            for(int i = 0; i < dssv.size(); i++){
                dssv.get(i).inThongTin();
            }
        }
    }
    
    public void sapXep(){
        dssv.sort((o1,o2)->o1.getHoTen().compareTo(o2.getHoTen()));
        System.out.println("Danh sach sau khi sap xep");
        for(int i = 0; i < dssv.size(); i++){
            dssv.get(i).inThongTin();
        }
    }
        
    
    public void keThua(){
        SinhVienPoly newSV = new SinhVienPoly();
        System.out.println("Xin moi nhap thong tin sinh vien Poly");
        newSV.nhapThongTin();
        System.out.println("Thong tin sau khi nhap:");
        newSV.inThongTin();
        
    } 
}
