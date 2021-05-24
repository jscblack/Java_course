/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-05-12 17:00:12
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
public class Main {
    public static String[] name={"A","B","C","D","E","F","G","H","I","J"};
    public static void main(String[] args) {
        Running runner=new Running();
        for (int i=0;i<10;i++) {
            System.out.println(name[i]);
            Thread thread = new Thread(runner, name[i]);
            thread.start();
        }
    }
}
class Running implements Runnable{
    boolean occu=false;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(Thread.currentThread().getName().equals(Main.name[i])){
                System.out.println(Main.name[i]+"等待过河");
                while(cross()==false){

                }
                System.out.println(Main.name[i]+"开始过河");
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){

                }
                System.out.println(Main.name[i]+"过河完成");
                occu=false;

            }
        }
    }
    synchronized boolean cross(){
        if(occu==false) {
            occu = true;
            return true;
        }else{
            return false;
        }
    }
}