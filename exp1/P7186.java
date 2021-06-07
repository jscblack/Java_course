
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-07 18:47:04
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class P7186 {

    public static void main(String[] args) {
        // write your code here
        int a[] = { -2, 1, 4, 5, 8, 12, 17, 23, 45, 56, 90, 100 };
        int n;
        Scanner rd = new Scanner(System.in);
        n = rd.nextInt();
        rd.close();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.printf("%d是数组中的第%d个元素", n, i);
                return;
            }
        }
        System.out.printf("%d不在数组中", n);
    }
}
