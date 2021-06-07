
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-07 18:46:55
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class P7194 {
    public static void main(String[] args) {

        // write your own codes
        Scanner rd = new Scanner(System.in);
        int t = rd.nextInt();
        while (t-- > 0) {
            int a, n, x = 0;
            x = rd.nextInt();
            n = rd.nextInt();
            a = x;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += a;
                a = a * 10 + x;
            }
            System.out.println(ans);
        }
        rd.close();
    }
}