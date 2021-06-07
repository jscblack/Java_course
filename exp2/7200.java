import java.util.Scanner;
class check{
    check(int a,int b){
        if (a > b) System.out.println("Larger value: " + a);
        else System.out.println("Larger value: " + b);
    }
    check(double a,double b,double c){
        System.out.println("a*b*c = "+a*b*c);
    }
    check(String a,String b){
        System.out.println("Are equal: "+(a.equals(b)?"true":"false"));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        new check(rd.nextInt(),rd.nextInt());
        new check(rd.nextDouble(),rd.nextDouble(),rd.nextDouble());
        new check(rd.next(),rd.next());
        rd.close();
    }

}
