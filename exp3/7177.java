/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:01:44
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        Cat a=new Cat(rd.next());
        a.AnimalPrint();
        Dog b=new Dog(rd.next());
        b.AnimalPrint();
        rd.close();
    }
}

class Cat extends Animal{
    Cat(String nm){
        this.name=nm;
        this.voice="喵喵";
    }
}

class Dog extends Animal{
    Dog(String nm){
        this.name=nm;
        this.voice="吱吱";
    }
}


abstract class Animal{
    String name;
    String voice;

    void AnimalPrint(){
        System.out.printf("%s的叫声为%s\n",this.name,this.voice);
    }
}