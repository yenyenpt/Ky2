
package lab7;


public class sinhvienIT extends sinhvienPoly{
Double diemJava, diemHtml, diemCss;

    public sinhvienIT() {
    }

    public sinhvienIT(Double diemJava, Double diemHtml, Double diemCss, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava  = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    



    @Override
    Double getDiem() {
       return (this.diemJava * 2 + this.diemHtml + this.diemCss) / 4;
    }
    
}
