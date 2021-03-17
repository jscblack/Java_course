import java.util.Scanner;

/**
 * Test
 */
public class Main {
    public static void main(String[] args) {
        int in [];
        in =new int [3];
        Scanner cin =new Scanner(System.in);
        for(int i=0;i<3;i++){
            in[i]=cin.nextInt();
        }
        cin.close();
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                if(in[i]>in[j]){
                    in[i]=in[i]^in[j];
                    in[j]=in[i]^in[j];
                    in[i]=in[i]^in[j];
                }
            }
            System.out.println(in[i]);
        }
    }
}