public class TruongPhong extends HanhChinh{//tạo lớp trưởng phòng kế thừa lạp lớp HanhChinh
    private double trachNhiem;//thuộc tính mới
    public TruongPhong() {}//hàm tạo không tham số
    //ghì đè phương thức nhập từ lớp HanhChinh để nhập thêm thông tin
    @Override
    public void nhap() {
        super.nhap();//goi phương thức nhập từ lớp HanhChinh
        System.out.println("Nhập tiền trách nhiệm: "); trachNhiem = scanner.nextDouble();
    }
    //ghì đè phương thức tính lương từ lớp HanhChinh
    @Override
    public double getLuong() {
        return super.getLuong() + trachNhiem;
    }//công thêm tiền trách nhiệm
    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
}