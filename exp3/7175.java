/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:01:29
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        BasicEmployee a=new BasicEmployee(rd.next(), rd.next(), rd.nextDouble());
        a.showSalary();
        a.showBonus();
        GoodEmployee b=new GoodEmployee(rd.next(), rd.next(), rd.nextDouble(), rd.nextDouble());
        b.showSalary();
        b.showBonus();
        rd.close();
    }
}

abstract class Employer {

    String name;
    String department;
    double salary;
    Employer(String n,String d,double s){
        this.name=n;
        this.department=d;
        this.salary=s;
    }
    void showSalary() {
        System.out.printf("我叫%s,在%s部门，我的工资是%.1f\n",this.name,this.department, this.salary);
    }

    abstract void showBonus();
}
/**
 * BasicEmployee
 */
class BasicEmployee extends Employer{
    BasicEmployee(String n,String d,double s){
        super(n,d,s);
    }
    void showBonus(){
        System.out.println("我是普通员工，没有奖金，加油升级！");
    }
}

/**
 * BasicEmployee
 */
class GoodEmployee extends Employer{
    double bonus;
    GoodEmployee(String n,String d,double s,double b){
        super(n,d,s);
        this.bonus=b;
    }
    void showBonus(){
        System.out.printf("我是优秀员工，我的奖金是%.1f\n",this.bonus);
    }    
}   