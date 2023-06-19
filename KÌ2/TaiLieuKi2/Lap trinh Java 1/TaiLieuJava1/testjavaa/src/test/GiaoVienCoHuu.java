package test;

public class GiaoVienCoHuu extends GiaoVien {
    private int namKiHD = 2018;
    public GiaoVienCoHuu () {}
    public GiaoVienCoHuu(String name, int age, double luong, int namKiHD) {
        super(name, age, luong);
        this.namKiHD = namKiHD;
    }
    @Override
    public void xuat() {
       super.xuat();
        System.out.println("Năm kí hợp đồng là: " + namKiHD);
    }
}
