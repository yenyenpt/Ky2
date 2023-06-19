import java.util.ArrayList;
import java.util.Scanner;

public class Lap5Bai1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Double> list = new ArrayList<>();
        double x;
        while(true) {
            x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhâp tiếp(1, 0): ");
            int nhap = scanner.nextInt();
            if(nhap == 0) {
                break;
            }
        }
        System.out.println("Các số vừa nhập là: ");
        for(Double a: list) {
            System.out.print(a + " ");
        }
        double sum = 0;
        for(Double a: list) {
            sum = sum + a;
        }
        System.out.println("\nTổng là: " + sum);
    }
}