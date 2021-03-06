
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-07 18:45:02
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class P1464 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                a[i][j] = scan.nextInt();
        }
        // Write Code Here
        int posx = 0, posy = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                if (a[i][j] > a[posx][posy]) {
                    posx = i;
                    posy = j;
                }
        }
        System.out.println("max=" + a[posx][posy]);
        System.out.printf("x=%d y=%d", posx, posy);
        scan.close();
    }
}