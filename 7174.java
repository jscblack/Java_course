/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:01:20
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your own codes
        Scanner rd=new Scanner(System.in);
        Vehicle a;
        a=new Vehicle(rd.nextInt(), rd.nextDouble());
        a.print();
        Car b;
        b=new Car(rd.nextInt(),rd.nextDouble(),rd.nextInt());
        b.print();
        Truck c;
        c= new Truck(rd.nextInt(), rd.nextDouble(), rd.nextInt(), rd.nextDouble());
        c.print();
        rd.close();
    }
}
/**
 * Vehicle
 */
class Vehicle {

    int tyre_cnt;
    double car_wgh;
    Vehicle(int cnt,double wgh){
        this.tyre_cnt=cnt;
        this.car_wgh=wgh;
    }
    void print(){
        System.out.printf("汽车:\n轮子数:%d个\n自身重量:%.1f吨\n",this.tyre_cnt,this.car_wgh);
    }    
}
class Car extends Vehicle{
    int pas_cnt;
    Car(int cnt,double wgh,int pas){
        super(cnt,wgh);
        this.pas_cnt=pas;
    }
    void print(){
        System.out.printf("小轿车:\n轮子数:%d个\n自身重量:%.1f吨\n额定乘客数:%d人\n",this.tyre_cnt,this.car_wgh,this.pas_cnt);
    }    
}
class Truck extends Vehicle{
    int pas_cnt;
    double cargo_cnt;
    Truck(int cnt,double wgh,int pas,double cgo){
        super(cnt,wgh);
        this.pas_cnt=pas;
        this.cargo_cnt=cgo;
    }
    void print(){
        System.out.printf("卡车:\n轮子数:%d个\n自身重量:%.1f吨\n额定乘客数%d人\n载重量%.1f吨\n",this.tyre_cnt,this.car_wgh,this.pas_cnt,this.cargo_cnt);
    }    
}