/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-03-17 20:25:35
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class Main {
    static boolean leap(int y){
        if(y%100==0) {
            return (y % 400 == 0) ? true : false;
        }else {
            return (y % 4 == 0) ? true : false;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m, n;

        m = scanner.nextInt();
        n = scanner.nextInt();

        //write your code
        int cnt=0;
        for (int i = m; i <=n ; i++) {
            if(leap(i)==true){
                System.out.print(i+" ");
                cnt++;
                if(cnt==4){
                    System.out.print("\n");
                    cnt=0;
                }
            }
        }
    }
}
