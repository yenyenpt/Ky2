import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<SinhVien> listSV = new ArrayList<>();
    public static void main(String [] args) {
        for (int i = 0; i < 5; i++) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            listSV.add(sv);
        }
        String ktemail = "\\w+@\\w+(\\. \\w+){1,2}";
        String ktsdt = "08\\d{8}";
        String ktcmnd = "\\d{10}";
        for (int i = 0; i < listSV.size(); i++) {
            if(!listSV.get(i).getEmail().matches(ktemail)) {
                System.out.println("email: " + listSV.get(i).getEmail() + " không đúng định dạng");
            }
            if(!listSV.get(i).getSDT().matches(ktsdt)) {
                System.out.println("sdt : " + listSV.get(i).getSDT() + " không đúng định dạng");
            }
            if(!listSV.get(i).getCMND().matches(ktcmnd)) {
                System.out.println("CMND: " + listSV.get(i).getCMND() + " không đúng định dạng.");
            }
        }
    }
}
