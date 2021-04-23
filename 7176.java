/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:01:36
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        Teacher a=new Teacher("英语", rd.next());
        a.TeachingRace();
        Teacher b=new Teacher("数学", rd.next());
        b.TeachingRace();
        
        rd.close();
    }
}
/**
 * Teacher
 */
interface Teacherable {
    public void TeachingRace();
}

class Teacher implements Teacherable{
    String subject,words;
    public Teacher(String sub,String wds){
        this.subject=sub;
        this.words=wds;
    }
    public void TeachingRace(){
        System.out.printf("我是%s老师，I say %s\n",this.subject,this.words);
    }
}