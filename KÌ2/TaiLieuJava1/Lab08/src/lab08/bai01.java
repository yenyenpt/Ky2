
package lab08;

public class bai01 {
    public static double sum(double ... nums){
        double s = 0;
        for(double x: nums){
            s +=x;
        }
        return s;
    }
    public static void main(String[] args) {
        double kq = sum(2);
        System.out.println("kết quả: "+kq);
        kq = sum(3, 5.6, 7);
        System.out.println("kết quả: "+kq);
        kq = sum(4,5,6,5,1,5,2,2,9);
        System.out.println("kết quả: "+kq);
        kq = sum(2.3,4.5);
        System.out.println("kết quả: "+kq);
    }
    
}
