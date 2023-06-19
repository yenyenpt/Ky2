
package lab7;


public class chunhat {
    double dai, rong;

    public chunhat() {
    }

    public chunhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public double getChuVi(){
        return (this.dai + this.rong)*2;
    }
     public double getDienTich(){
        return (this.dai * this.rong);
    }
     public void xuat(){
         System.out.printf("chieu dai: %.1f\n Chieu rong: %.1f\n Chu vi: %.1f\n Dien tich: %.1f\n",this.dai, this.rong, this.getChuVi(), this.getDienTich());
     }
}
