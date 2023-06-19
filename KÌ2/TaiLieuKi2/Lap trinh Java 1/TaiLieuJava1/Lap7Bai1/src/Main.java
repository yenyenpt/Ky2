public class Main {
    public static void main(String [] args) {
        ChuNhat cn = new ChuNhat();
        cn.nhap();
        Vuong vuong = new Vuong();
        vuong.nhap();
        cn.xuat();
        vuong.xuat();
    }
}
