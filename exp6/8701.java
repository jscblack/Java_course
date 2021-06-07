/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-28 17:47:36
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class TestTriangle {
    static void triangle(int a, int b,int c) throws IllegalArgumentException,InputMismatchException{
	//starts
    if(!(a+b>c&&a+c>b&&b+c>a))throw new IllegalArgumentException();
	//end
	}
}
public class Main {
	public static void main(String[] args) {
		int a=0, b=0, c=0;
		Scanner in = new Scanner(System.in);
	    	a = in.nextInt();
	    	b = in.nextInt();
	   	c = in.nextInt();
		try{
	    		//starts
                TestTriangle.triangle(a,b,c);
				//end
				System.out.printf("三角形的三边长为：%d,%d,%d\n",a,b,c);
	    }
        catch (IllegalArgumentException e){
                System.out.printf("%d,%d,%d不能构成三角形\n",a,b,c);
        }catch (InputMismatchException e) {
            System.out.printf("请输入整数作为三角形的边长！\n");
        }


	}
}