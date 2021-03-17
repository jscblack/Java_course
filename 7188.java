import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student stu=new Student();
        Scanner rd=new Scanner(System.in);
        String in;
        in=rd.nextLine();
        String tmp[]=in.split(" ");
        stu.setName(tmp[0]);
        Integer holy=Integer.valueOf(tmp[1]);
        stu.setAge(holy.intValue());
        System.out.print("该生姓名："+stu.getName()+","+"年龄："+stu.getAge());
        rd.close();
    }

}
class Student{
    String name;
    int age;
    void setName(String nm){
        this.name=nm;
    }
    String getName(){
        return this.name;
    }
    void setAge(int ag){
        this.age=ag;
    }
    int getAge(){
        return this.age;
    }
}
