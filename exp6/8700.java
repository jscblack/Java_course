/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-06-16 13:58:29
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */

import java.util.Scanner;

class DangerException extends Exception {
    // starts
    public void printMessage() {
        System.out.printf("超重\n");
    }
    // end
}

class CargoBoat {
    int realContent; // 装载的重量
    int maxContent; // 最大装载量

    public void setMaxContent(int c) {
        maxContent = c;
    }

    public void loading(int m) throws DangerException {
        // starts
        if (realContent + m <= maxContent) {
            realContent += m;
        } else {
            throw new DangerException();
        }
        // end
    }
}

public class Main {
    public static void main(String args[]) {
        CargoBoat ship = new CargoBoat();
        Scanner s = new Scanner(System.in);
        ship.setMaxContent(1000);
        int m = 0;
        try {
            // starts
            while (s.hasNextInt()) {
                m = s.nextInt();
                ship.loading(m);
                System.out.printf("目前装载了%d吨货物\n", ship.realContent);
            }
            // end
        } catch (DangerException e) {   
            // starts
            e.printMessage();
            System.out.printf("无法再装载重量是%d吨的集装箱\n", m);
            // end
        } finally {
            System.out.printf("货船将正点启航");
        }
    }
}