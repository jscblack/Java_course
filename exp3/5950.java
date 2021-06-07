/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:02:01
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

import static java.lang.Math.*;
import static java.util.Collections.sort;

interface ComputerAverage {
    //start
    //write your code between start and  end,do not  delete any code
    double average(double[] data);
    //end
}
class Gymnastics implements ComputerAverage {
    public double average(double []data) {
        double sum=0;
        double temp;
        //start
        //write your code between start and  end,do not  delete any code
        temp=data[0];
        for (int i = 0; i < data.length; i++) {
            sum+=data[i];
            temp=max(temp,data[i]);
        }
        sum-=temp;
        temp=data[0];
        for (int i = 0; i < data.length; i++) {
            temp = min(temp, data[i]);
        }
        sum-=temp;
        sum/=(data.length-2);
        return sum;
        //end
    }
}
class School implements ComputerAverage{
    //start
    //write your code between start and  end,do not  delete any code
    double sum=0;
    public double average(double []data) {
        for (int i = 0; i < data.length; i++) {
            sum+=data[i];
        }
        sum/=data.length;
    //end
      return sum;
}
}
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double []data=new double[n];
        for(int i=0;i<n;i++){
            data[i]=scan.nextDouble();
        }
        //start
        //write your code between start and  end,do not  delete any code
        ComputerAverage g=new Gymnastics();
        //end
        System.out.print("Gymnastics average is:");
        System.out.printf("%.2f\n",g.average(data));
        //start
        //write your code between start and  end,do not  delete any code
        g =new School();
        //end
        System.out.print("School average is:");
        System.out.printf("%.2f",g.average(data));
    }
}