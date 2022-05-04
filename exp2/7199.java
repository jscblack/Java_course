
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-15 20:43:28
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

class Prime {
    // Write your own code
    static boolean prime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Write your own code
        System.out.println(Prime.prime(n) ? "YES" : "NO");
        in.close();
    }
}