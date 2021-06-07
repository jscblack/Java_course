/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-03-17 20:26:30
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        int a,b,c;
        Scanner rd=new Scanner(System.in);
        a=rd.nextInt();
        b= rd.nextInt();
        c= rd.nextInt();
        System.out.print("和="+Add.cal(a,b,c));
    }
}
// Write your own code
class Add{
    static int cal(int a,int b,int c){
        int res=0;
        int d=a+(b-1)*c;
        return (a+d)*b/2;
    }
}