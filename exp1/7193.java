import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        //write your own codes
        double f;
        Scanner rd=new Scanner(System.in);
        f=rd.nextDouble();
        rd.close();
        System.out.printf("The temprature is %.2f",5*(f-50)/9+10);
    }
}