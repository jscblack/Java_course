/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:02:09
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
interface Paper {
    public String GetName();

}

public class Main {
    public static void main(String[] args) {
        Printer p=new Printer();
        Paper pr=new A4Paper();
        p.Print(pr);
        pr= new A6Paper();
        p.Print(pr);

    }
}

class  A4Paper implements Paper{
    @Override
    public String GetName() {
        return "A4";
    }
}

class  A6Paper implements Paper{
    @Override
    public String GetName() {
        return "A6";
    }
}

class Printer {
    public void Print(Paper p) {
        System.out.println(p.GetName());

    }

}