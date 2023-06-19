import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    static ArrayList <SanPham> listSP = new ArrayList<>();
    public static void main(String [] args) {
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            listSP.add(sp);
        }
        System.out.println("Danh sách vừa nhập là: ");
        for (int i = 0; i < 5; i++) {
            listSP.get(i).xuat();
        }
        System.out.println("Hãng Nokia gồm: ");
        for(int i = 0; i < 5; i++) {
            if(listSP.get(i).getHang().equals("Nokia")) {
                listSP.get(i).xuat();
            }
        }
    }
}
