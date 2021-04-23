/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-04-23 20:01:53
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer();
        Mouse mouse=new Mouse();
        KeyBoard keyboard=new KeyBoard();
        Mic mic=new Mic();
        computer.add(mouse);
        computer.add(keyboard);
        computer.add(mic);
        computer.powerOn();
        computer.powerOff();
    }

}
interface USB{
    public void turnOn();
    public void turnOff();
}
class Mouse implements USB{
    public void turnOn(){
        System.out.println("鼠标启动了");
    }
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
class KeyBoard implements USB{
    public void turnOn(){
        System.out.println("键盘启动了");
    }
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
class Mic implements USB{
    public void turnOn(){
        System.out.println("麦克启动了");
    }
    public void turnOff() {
        System.out.println("麦克关闭了");
    }
}
class Computer {
    USB[] device = new USB[5];
    int num = 3;

    public void add(USB usb) {
        for (int i = 0; i < num; i++) {
            if (device[i] == null) {
                device[i] = usb;
                return;
            }
        }
    }

    public  void powerOn() {
        for (int i = 0; i < num; i++) {
            if (device[i] != null) {
                device[i].turnOn();
            }
        }
        System.out.println("计算机开机成功");
    }

    public  void powerOff() {
        for (int i = 0; i < num; i++) {
            if (device[i] != null) {
                device[i].turnOff();
            }
        }
        System.out.println("计算机关机成功");
    }
}