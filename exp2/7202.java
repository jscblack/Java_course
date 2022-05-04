
/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-15 20:46:45
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int m, n; // 第一个数的实部和虚部
        int p, q; // 第二个数的实部和虚部
        Scanner scanner = new Scanner(System.in);
        m = Integer.parseInt(scanner.next());
        n = Integer.parseInt(scanner.next());
        p = Integer.parseInt(scanner.next());
        q = Integer.parseInt(scanner.next());
        Complex t = new Complex(m, n);
        Complex s = new Complex(t);
        Complex r = new Complex(p, q);
        (s.Add(r)).Print();
        (t.Sub(r)).Print();
    }
}

// Write your own code
class Complex {
    int real, img;

    Complex() {
        this.real = 0;
        this.img = 0;
    }

    Complex(Complex cp) {
        this.real = cp.real;
        this.img = cp.img;
    }

    Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    Complex Add(Complex b) {
        Complex ret = new Complex(this.real, this.img);
        ret.real += b.real;
        ret.img += b.img;
        return ret;
    }

    Complex Sub(Complex b) {
        Complex ret = new Complex(this.real, this.img);
        ret.real -= b.real;
        ret.img -= b.img;
        return ret;
    }

    void Print() {
        if (this.real != 0 && this.img != 0) {
            System.out.printf("%d %di\n", real, img);
        } else {
            System.out.printf("0\n");
        }
    }
}