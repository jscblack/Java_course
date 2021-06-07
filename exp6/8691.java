/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-28 19:40:51
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        //write code here
        Scanner rd=new Scanner(System.in);
        try{
            int n=rd.nextInt();
            System.out.println(10-n);
        }
        catch (InputMismatchException e){
            System.out.println("not int");
        }
        System.out.println("end");
    }
}