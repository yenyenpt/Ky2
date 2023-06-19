
package lab7;

import java.util.Scanner;
abstract public class sinhvienPoly {
    String hoTen;
    String nganh;

    public sinhvienPoly() {
    }

    public sinhvienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    abstract  Double getDiem();
    public String getHocLuc(){
    if(this.getDiem()<  5){
        return "Yếu";
    } else if(this.getDiem() < 6.5){
        return "Trung binh";
    } else if(this.getDiem() < 7.5){
        return "Kha";
    } else if(this.getDiem() < 9){
        return "Gioi";
    } else{
        return "Xuat sac";
    }
    }
    
    public void xuat(){
        System.out.println("Thong tin sinh vien: ");
        System.out.print("\tHo ten: "+this.hoTen);
        System.out.print("\tNganh: "+this.nganh);
        System.out.print("\tDiem: "+this.getDiem());
        System.out.print("\tHoc luc: "+this.getHocLuc());
        System.out.println("");
}
}
