/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:02:40
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        String in=rd.next();
        String rep=rd.next();
        //System.out.println(rep);
        in=in.replaceAll(rep, "");
        System.out.println(in);
        StringBuffer buf;
        buf=new StringBuffer();
        buf.append(in);
        System.out.println(buf.reverse());

        
        rd.close();
    }
}