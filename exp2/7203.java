/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-03-17 20:26:39
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

class ObjectCounter {
    private static int cnt;
    ObjectCounter(){
        cnt++;
    }

//write your code here
    static int getCount(){
        return cnt;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            ObjectCounter str1 = new ObjectCounter();
        }
        System.out.println(ObjectCounter.getCount());
    }
}
