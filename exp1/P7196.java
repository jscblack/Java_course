
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-07 18:47:40
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class P7196 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // write your code
        double ans = 0;
        int pn = 1;
        for (int i = 0; i < n; i++) {
            ans += (pn) * (1.0 / (3 * i + 1));
            pn = pn * (-1);
        }
        System.out.println(ans);
        scanner.close();
    }
}