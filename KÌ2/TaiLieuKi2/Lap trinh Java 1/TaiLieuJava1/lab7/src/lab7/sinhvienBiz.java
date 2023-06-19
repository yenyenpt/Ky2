
package lab7;


public class sinhvienBiz extends sinhvienPoly{
Double diemMarketing, diemSales;

    public sinhvienBiz() {
    }

    public sinhvienBiz(Double diemMarketing, Double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }


    @Override
    Double getDiem() {
        return (this.diemMarketing * 2 + this.diemSales) / 3;
    }
    
}
