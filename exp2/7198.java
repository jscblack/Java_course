/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-03-17 20:26:55
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

class Dog{
    private String name;
    private String color;
    private int age;
    public Dog(){
        this.name="dog1";
        this.color="white";
        this.age=1;
    }
    public Dog(String name,String color,int age){
        this.age=age;
        this.color=color;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public String getcolor(){
        return this.color;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public  void setAge(int age){
        this.age=age;
    }

}

public class Main {
    public static void main(String[] args) {
        //write code here
        Scanner rd=new Scanner(System.in);
        Dog d1,d2;
        d1=new Dog();
        d2=new Dog(rd.next(),rd.next(),rd.nextInt());
        System.out.println("name=" + d1.getName() + ",color=" +d1.getcolor()+",age="+d1.getAge());
        System.out.println("name=" + d2.getName() + ",color=" +d2.getcolor()+",age="+d2.getAge());
    }
}