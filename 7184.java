import java.util.Scanner;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String in = rd.nextLine();
            String[] res = in.split(" ");
            if (res[0].equals("圆形")) {
                Double r=Double.valueOf(res[1]);
                System.out.printf("圆形面积=%.1f\n", r*r*3.14);
            }
            else if(res[0].equals("矩形")){
                Double a=Double.valueOf(res[1]);
                Double b=Double.valueOf(res[2]);

                System.out.printf("矩形面积=%.1f\n", a*b);
               
            }
            else{
                System.out.println("输入的不是圆形或矩形");
            }
        
        rd.close();
}
}