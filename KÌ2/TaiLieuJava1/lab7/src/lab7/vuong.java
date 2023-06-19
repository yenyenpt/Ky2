
package lab7;


public class vuong extends chunhat{
    double canh;

    public vuong() {
        super();
    }

    public vuong(double canh) {
        super(canh,canh);
        this.canh = canh;
    }

    @Override
    public void xuat() {
       // super.xuat(); 
         System.out.printf("Canh: %.1f\n Chu vi: %.1f\n Dien tich: %.1f\n",this.canh, super.getChuVi(), super.getDienTich());
    }
    
}
