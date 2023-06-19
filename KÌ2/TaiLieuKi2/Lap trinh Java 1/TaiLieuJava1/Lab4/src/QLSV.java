
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chuottp
 */
public class QLSV {
    private static final Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVien> DanhSach = new ArrayList();
    
    public void input(){
        System.out.println("Moi nhap so luong sinh vien: ");
        Integer soLuong = sc.nextInt();
        
        for(Integer i = 0; i < soLuong ; i++){
            System.out.println("Sinh vien thu " + (i + 1));
            
        }
        
    }
    
    
}
