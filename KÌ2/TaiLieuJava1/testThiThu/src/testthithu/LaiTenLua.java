package testthithu;

public class LaiTenLua extends LaiMayBay {

    private double tocDo;
    private double nangLuong;

    public LaiTenLua() {
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap toc do: ");
        tocDo = sc.nextDouble();
        System.out.println("Nhap nang luong: ");
        nangLuong = sc.nextDouble();
    }

    @Override
    public int getTuoi() {
        return (int) (super.getTuoi() + tocDo * nangLuong);
        
    }
    public double getTocDo() {
        return tocDo;
    }

    public void setTocDo(double tocDo) {
        this.tocDo = tocDo;
    }

    public double getNangLuong() {
        return nangLuong;
    }

    public void setNangLuong(double nangLuong) {
        this.nangLuong = nangLuong;
    }

}
