/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-03-17 20:24:20
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    static int prime[];
    static boolean notprime[];
    static int prisit;

    public static void main(String[] args) {
        int n;
        Scanner rd = new Scanner(System.in);
        n = rd.nextInt();
        rd.close();
        if (n > 1) {
            prime(n);
            for (int i = 1; i <= prisit; i++) {
                System.out.print(prime[i] + " ");
            }
        } else {
            System.out.println("输入n不是大于1正整数");
        }

    }

    static void prime(int n) {
        // get prime smaller than n
        Main.prime = new int[n + 5];
        notprime = new boolean[n + 5];
        prisit = 0;
        notprime[0] = true;
        notprime[1] = true;
        for (int i = 2; i <= n; i++) {
            if (!notprime[i]) {
                prime[++prisit] = i;
            }
            for (int j = 1; j <= prisit && i * prime[j] <= n; j++) {
                notprime[i * prime[j]] = true;
                if (i % prime[j] == 0)
                    break;
            }
        }
    }
}