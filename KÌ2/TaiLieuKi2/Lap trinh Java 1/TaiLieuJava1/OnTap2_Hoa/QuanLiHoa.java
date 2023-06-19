/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap2_Hoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author chuottp
 */
public class QuanLiHoa {
    private static final Scanner sc = new Scanner(System.in);
    public ArrayList<Hoa> QLH = new ArrayList();
    
    public void input(){
        while(true){
            System.out.println("Nhap thong tin hoa");
            Hoa hoa = new Hoa();
            hoa.nhapHoa();
            QLH.add(hoa);
            
            String nhapTiep;
            while(true){
                System.out.println("Ban co muon nhap tiep hay khong[Y/N]: ");
                nhapTiep = sc.next();
                if(!nhapTiep.equalsIgnoreCase("Y") && (!nhapTiep.equalsIgnoreCase("N"))){
                    System.out.println("Nhap sai moi nhap lai!!");
                    break;
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
        for(int i = 0; i < QLH.size(); i++){
            System.out.println("Hoa thu " + (i+1));
            QLH.get(i).hienHoa();
        }
    }
    public void lookFor(){
        System.out.println("Nhap ma Id ban muon tim: ");
        Integer maID = sc.nextInt();
        Integer soDem = 0;
        for(int i = 0; i < QLH.size(); i++){
            if(maID == QLH.get(i).getID()){
                QLH.get(i).hienHoa();
                soDem ++;
                break;
            }
        }
        if(soDem == 0){
            System.out.println("Khong tim thay ma Id ban can!!");
        }
    }
            
    public void delete(){
        System.out.println("Nhap ID ban muon xoa: ");
        Integer maId = sc.nextInt();
        Integer soDem = 0;
        for(int i = 0; i < QLH.size(); i++){
            
            if(maId == QLH.get(i).getID()){
                QLH.remove(i);
                soDem = 1;
                break;
            }
        }
        
         
        if(soDem == 0){
            System.out.println("Khong tim thay Id ban muon xoa!!");
        }else{
            System.out.println("Danh sach hoa sau khi xoa");
            for(int i = 0; i < QLH.size(); i++){
            QLH.get(i).hienHoa();
            }
        }  
    }
    //kh nhớ nỗi phần sắp xếp đâuuu
    public void arrange(){
        Collections.sort(QLH, new Comparator<Hoa>(){
            @Override
            public int compare(Hoa o1, Hoa o2) {
              return o1.getID() > o2.getID() ? -1 : 1;
            }
            
        });

        System.out.println("Danh sach sau khi sap xep");
        for(int i = 0; i < QLH.size(); i++){
            QLH.get(i).hienHoa();
        }
    }
    
    public void keThua(){
        HoaHong hoahoa = new HoaHong();
        System.out.println("Xin moi nhap thong tin doi tuong khoi tao");
        hoahoa.nhapHoa();
        System.out.println("Thong tin sau khi nhap doi tuong");
        hoahoa.hienHoa();  
    
    }
    
}
