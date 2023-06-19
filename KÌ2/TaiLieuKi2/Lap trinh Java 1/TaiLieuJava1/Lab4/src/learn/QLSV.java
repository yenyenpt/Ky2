/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class QLSV {
    private static final Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVien> Love  = new ArrayList();
    
    
    public void input(){
        System.out.println("Xin moi nhap so luong sinh vien: ");
        Integer soLuong = sc.nextInt();
        
        for(Integer i = 0; i < soLuong; i++){
            System.out.println("Sinh vien thu " + (i+1));
            SinhVien thongtin = new SinhVien();
            thongtin.nhapThongTin();
            Love.add(thongtin);
        }
    }
    
    public void output(){
        for(Integer i = 0; i < Love.size(); i++){
            System.out.println("Sinh vien thu " + (i+1));
            Love.get(i).inThongTin();
        }
    }
    
    public void lookFor(){
        System.out.println("Nhap ma sinh vien can tim: ");
        String maSV = sc.next();
        for(Integer i = 0; i < Love.size(); i++){
            if(maSV.equals(Love.get(i).getMaSV())){
                Love.get(i).inThongTin();
                break;
            }
        }
        
    }
    
    
}
