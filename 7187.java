import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cubic a=new cubic();
        int x,y,z;
        Scanner rd=new Scanner(System.in);
        x=rd.nextInt();
        y=rd.nextInt();
        z=rd.nextInt();
        a.setDemo(x,y,z);
        System.out.print("体积="+a.V_cal());
    }

}
class cubic{
    int x;
    int y;
    int z;
    void setDemo(int x,int y,int z) {
    this.x=x;
    this.y=y;
    this.z=z;
    }
    int  V_cal(){
        return x*y*z;
    }
}
