
package lab08;


public class XPoly {
     public static double sum(double ... nums){
        double s = 0;
        for(double x: nums){
            s +=x;
        }
        return s;
    }
     
     public static double min(double ... nums){
         double m = nums[0];
         for(double y: nums){
             m = Math.min(m, y);
         }
         return m;
     }
     public static double max(double ... nums){
         double m = nums[0];
         for(double x: nums){
             m = Math.max(m, x);
         }
         return m;
     }
     
    public static void main(String[] args) {
        double kq = max(2);
        System.out.println("kết quả: "+kq);
        kq = max(3, 5.6, 7);
        System.out.println("kết quả: "+kq);
        kq = min(4,5,6,5,1,5,2,2,9);
        System.out.println("kết quả: "+kq);
        kq = min(2.3,4.5);
        System.out.println("kết quả: "+kq);
    }
}
