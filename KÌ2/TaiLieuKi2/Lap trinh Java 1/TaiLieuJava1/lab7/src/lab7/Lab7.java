
package lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lab7 {

    static ArrayList<sinhvienIT> sinhvienIT = new ArrayList<sinhvienIT>();
    static ArrayList<sinhvienBiz> sinhvienBiz = new ArrayList<sinhvienBiz>();
    public static void main(String[] args) {
        // cau 4
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMenu: ");
        System.out.println("1.Nhap danh sach sinh vien: ");
        System.out.println("2.Xuat danh sach sinh vien: ");
        System.out.println("3.Xuat danh sach sinh vien co hoc luc gioi: ");
        System.out.println("4.Sap xep danh sach sinh vien theo diem: ");
        System.out.println("5.ket thuc: ");
        System.out.println("Moi ban chon chuc nang: ");
        int chon=scanner.nextInt();
        switch(chon){
            case 1: 
                nhap();
                break;
            case 2: 
                xuat();
                break;
            case 3: 
                xuatsvgioi();
                break;
            case 4: 
                sapxep();
                break;
            case 5: 
               System.exit(0);
        } 
    }
}
    public static void nhap(){
         Scanner scanner = new Scanner(System.in);
         while(true){
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.print("Ho ten: ");
        String hoTen = scanner.nextLine();
        String nganh;
        while(true){
         System.out.print("Nganh(IT/Biz): ");
       nganh = scanner.nextLine();
        if(nganh.equalsIgnoreCase("IT") || nganh.equalsIgnoreCase("Biz")){
            break;
            }
        }
        if(nganh.equalsIgnoreCase("IT")){
             System.out.printf("Diem java: ");
            Double java = scanner.nextDouble();
            
             System.out.printf("Diem html: ");
            Double html = scanner.nextDouble();
            
             System.out.printf("Diem css: ");
            Double css = scanner.nextDouble();
            
            sinhvienIT svIT = new sinhvienIT(java, html, css, hoTen, nganh );
            sinhvienIT.add(svIT);
        }else{
             System.out.printf("Diem Marketing: ");
             Double Marketing = scanner.nextDouble();
             
              System.out.printf("Diem Sales: ");
            Double Sales = scanner.nextDouble();
            
            sinhvienBiz svBiz = new sinhvienBiz(Marketing, Sales, hoTen, nganh );
            sinhvienBiz.add(svBiz);
        }
        System.out.println("Tiep tuc nhap khong(Y/N)?");
        scanner.nextLine();
        if(scanner.nextLine().equalsIgnoreCase("N")){
            break;
        }
         }
        
    }
     public static void xuat(){
         System.out.println("Xuat thong tin sinh vien: ");
         for(sinhvienIT svIT:sinhvienIT){
             svIT.xuat();
         }
         for(sinhvienBiz svBiz:sinhvienBiz){
             svBiz.xuat();
         }
        
    }
      public static void xuatsvgioi(){
          System.out.println("Danh sach sinh vien gioi: ");
        for(sinhvienIT svIT:sinhvienIT){
            if(svIT.getHocLuc().equals("Gioi")){
             svIT.xuat();
            }
         }
         for(sinhvienBiz svBiz:sinhvienBiz){
              if(svBiz.getHocLuc().equals("Gioi")){
             svBiz.xuat();
         }
      }
    }
       public static void sapxep(){
             Scanner scanner = new Scanner(System.in);
            System.out.println("Săp xep: ");
            Comparator<sinhvienIT> compITTang = new Comparator<sinhvienIT>(){
                @Override
                public int compare(sinhvienIT o1, sinhvienIT o2){
                    return o1.getDiem().compareTo(o2.getDiem());
                }
            };
            
            Comparator<sinhvienBiz> compBizTang = new Comparator<sinhvienBiz>(){
                @Override
                public int compare(sinhvienBiz ol, sinhvienBiz o2){
                    return ol.getDiem().compareTo(o2.getDiem());
                }
            };
            
            
            Comparator<sinhvienIT> compITGiam = new Comparator<sinhvienIT>(){
                @Override
                public int compare(sinhvienIT o1, sinhvienIT o2){
                    return o2.getDiem().compareTo(o1.getDiem());
                }
            };
            
            
            Comparator<sinhvienBiz> compBizGiam = new Comparator<sinhvienBiz>(){
                @Override
                public int compare(sinhvienBiz o1, sinhvienBiz o2){
                    return o2.getDiem().compareTo(o1.getDiem());
                }
            };
             System.out.println("Ban muon sap xep tang dan hay giam dan: (T/G)? ");
              if(scanner.nextLine().equalsIgnoreCase("T")){
                  Collections.sort(sinhvienIT, compITTang);
                  Collections.sort(sinhvienBiz, compBizTang);
              }else{
                  Collections.sort(sinhvienIT, compITGiam);
                  Collections.sort(sinhvienBiz, compBizGiam);
              }
       }
   
}
