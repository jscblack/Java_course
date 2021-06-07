
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-07 18:47:13
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.*;

public class P7195 {

    public static void main(String[] args) {
        int number, digit1, digit2, digit3, digit4, newnum;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        // WRITE CODE HERE
        digit4 = number % 10;
        number /= 10;
        digit4 = (digit4 + 9) % 10;
        digit3 = number % 10;
        number /= 10;
        digit3 = (digit3 + 9) % 10;
        digit2 = number % 10;
        number /= 10;
        digit2 = (digit2 + 9) % 10;
        digit1 = number % 10;
        number /= 10;
        digit1 = (digit1 + 9) % 10;
        newnum = digit2 + digit1 * 10 + digit4 * 100 + digit3 * 1000;
        System.out.println("The encrypted number is " + newnum);
        scanner.close();
    }

}
