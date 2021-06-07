
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-07 18:47:24
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class P7197 {
    static boolean leap(int y) {
        if (y % 100 == 0) {
            return (y % 400 == 0) ? true : false;
        } else {
            return (y % 4 == 0) ? true : false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m, n;

        m = scanner.nextInt();
        n = scanner.nextInt();

        // write your code
        int cnt = 0;
        for (int i = m; i <= n; i++) {
            if (leap(i) == true) {
                System.out.print(i + " ");
                cnt++;
                if (cnt == 4) {
                    System.out.print("\n");
                    cnt = 0;
                }
            }
        }
        scanner.close();
    }
}
