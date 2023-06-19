package lab08;

import static lab08.bai01.sum;

public class bai03 {

    public static String vietHoa(String name) {
        String[] ars = name.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < ars.length; i++) {
            String x = ars[i];
            if (!x.equals("")) {
                String ch = x.substring(0, 1).toUpperCase();
                x = ch + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String name = "le hai dang";
        String newName = vietHoa(name);
        System.out.println(" Tên: " + newName);

        name = "le      hai     dang";
        newName = vietHoa(name);
        System.out.println("Tên :"+newName);
    }
}
