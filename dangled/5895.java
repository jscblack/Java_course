/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:03:12
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n;
        n=rd.nextInt();
        BigInteger ans=new BigInteger("0");
        BigInteger abse=new BigInteger("1");
        for (long i = 1; i <=n; i++) {
            abse=abse.multiply(BigInteger.valueOf(i));
            ans=ans.add(abse);
        }

        System.out.println(ans);
        rd.close();
    }
}