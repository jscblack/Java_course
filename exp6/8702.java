
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-16 13:59:46
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

class NoAgesException {
    NoAgesException() {
    }

    static void triangle(Person p) throws IllegalArgumentException {
        // start
        if (p.age < 0 || p.age > 200) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(p.name + "..." + p.age);
        }
        // end
    }
}

class Person {
    // start
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // end
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person p = new Person(s.next(), s.nextInt());
        ;
        try {
            // start
            NoAgesException.triangle(p);
            // end
        } catch (IllegalArgumentException e) {
            System.out.println("年龄数值非法");
        }
    }
}