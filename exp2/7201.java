
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-15 20:46:11
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.Scanner;

class Point {
    private int x;
    private int y;

    public Point(int xx, int yy) // 构造方法
    {
        this.x = xx;
        this.y = yy;
    }

    public Point(Point cp) // 构造方法
    {
        this.x = cp.x;
        this.y = cp.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // write your code
    public static void fun1(Point p) {
        System.out.println(p.getX());
    }

    public static Point fun2() {
        Point A = new Point(1, 2);
        return A;
    }

}

public class Main {
    public static void main(String[] args) {
        // write your code
        Point a;
        Scanner rd = new Scanner(System.in);
        int x, y;
        x = rd.nextInt();
        y = rd.nextInt();
        a = new Point(x, y);
        Point b = new Point(a);
        System.out.println(b.getX());
        Point.fun1(b);
        b = Point.fun2();
        System.out.println(b.getX());
    }
}