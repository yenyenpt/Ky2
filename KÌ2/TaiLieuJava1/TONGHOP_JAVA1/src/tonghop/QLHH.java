/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tonghop;

import java.util.ArrayList;
import java.util.Scanner;


public class QLHH {
    private static final Scanner sc = new Scanner(System.in);
    public ArrayList<HangHoa> QuanLyHangHoa = new ArrayList();
    
//Cau 1
    public void chucNang1() {
            System.out.println("1. nhập hàng hóa");
                HangHoa HangHoa = new HangHoa();
                HangHoa.nhapHH();
                QuanLyHangHoa.add(HangHoa);

        }
//Cau 2
        public void chucNang2(){
            System.out.println("2. Xuất danh sách Hàng Hóa");
            if(!QuanLyHangHoa.isEmpty()){
                for(HangHoa item : QuanLyHangHoa){
                    item.hienHH();
                }
            }else {
                System.out.println("Danh sách rỗng!!");
            }
        }
//Cau 3
        public void chucNang3(){
        Integer maCanTim;
        HangHoa hhCanTim = null;
        while(true){
            maCanTim = Integer.parseInt(nhapp("mã id đối tượng muốn tìm"));
            for (HangHoa hanghoa : QuanLyHangHoa) {
                Integer maHH = hanghoa.getMaHang();
                if (maCanTim == maHH) {
                    hhCanTim = hanghoa;
                    System.out.println("1. thay đổi thông tin");
                    hhCanTim.nhapHH();
                    hanghoa = hhCanTim;
                    break;
                }
            }
            if (hhCanTim==null) {
                System.out.println("Ko có thông tin");
                break;
                }
            }
        }
        public String nhapp(String tt) {
                    System.out.println(tt);
                    String thongTin = sc.next();
                    return thongTin;
        }
 //Cau 4       
        public void chucNang4(){
            String tenCanTim;
            HangHoa hhCanTim = null;
            while(true){
                tenCanTim = nhapp("Tên đối tượng muốn tìm");
                for (HangHoa hanghoa : QuanLyHangHoa) {
                    String tenHH = hanghoa.getTenHang();
                    if (tenCanTim.equals(tenHH)) {
                        hhCanTim = hanghoa;
                        break;
                    }
                }
                if (hhCanTim==null) {
                    System.out.println("Ko có thông tin");
                    break;
                }else{
                    hhCanTim.hienHH();
                }
                    break;
                }
            }
//Cau 5      
        public void chucNang5() {
            System.out.println("4. Sắp xếp Hang theo ten giam dan");
            if(!QuanLyHangHoa.isEmpty()){
                ArrayList<HangHoa> dsSapXep = (ArrayList<HangHoa>) QuanLyHangHoa.clone();
                dsSapXep.sort((M, N) -> M.getTenHang().compareTo(N.getTenHang()));
                for (HangHoa HangHoa : dsSapXep) {
                    HangHoa.hienHH();
                }
            }else {
                System.out.println("Danh sách rỗng!!");
            }
        }
//Cau6
        public void chucNang6(){
        Integer maCanTim;
        HangHoa hhCanTim = null;
        while(true){
            maCanTim = Integer.parseInt(nhapp("mã id đối tượng muốn xóa"));
            for (HangHoa hanghoa : QuanLyHangHoa) {
                Integer maHH = hanghoa.getMaHang();
                if (maCanTim == maHH) {
                    hhCanTim = hanghoa;
                    QuanLyHangHoa.remove(hanghoa);
                    System.out.println("đã xóa");
                    break;
                }
            }
            if (hhCanTim==null) {
                System.out.println("Ko có thông tin");
                break;
            }
        }
    }
//Cau8
        public void chucnang8(){
            int dem=0;
            System.out.println("Mời nhập soluong min: ");
            Integer soluongMin = sc.nextInt();
            System.out.println("Mời nhập soluong max: ");
            Integer soluongMax = sc.nextInt();

        ArrayList<HangHoa> dsCanTim = new ArrayList();
        for(HangHoa hh :QuanLyHangHoa){
            Integer soluong = hh.getSoLuong();
            if(soluong>= soluongMin && soluong<= soluongMax){
                dsCanTim.add(hh);
            }
        }
        if(dsCanTim.isEmpty()){
            System.out.println("Rỗng");
        }else{
            for(HangHoa hh : dsCanTim){
                hh.hienHH();
                dem++;
            }
        }
        if(dem==0){
            System.out.println("Ko có thông tin");
        }

    }

//Cau 9
        public void chucNang9(){
            HangXuatKhau hangxuatkhau = new HangXuatKhau();
            System.out.println("Nhap thong tin hang hoa: ");
            hangxuatkhau.nhapHH();
            System.out.println("Thong tin sau khi nhap: ");
            hangxuatkhau.hienHH();
        }
          
}
