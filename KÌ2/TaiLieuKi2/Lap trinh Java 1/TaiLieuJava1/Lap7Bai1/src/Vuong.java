public class Vuong extends ChuNhat{
    private double canh;

    @Override
    public void nhap() {
        System.out.println("Nhập cạnh: ");
        canh = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        System.out.println("chiều dài cạnh: " + canh + "chu vi: " + (canh * 4) + ", dien tích: " + (canh * canh));
    }
}
