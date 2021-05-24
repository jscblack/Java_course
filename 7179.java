/*
 * @Author       : Gehrychiang
 * @LastEditTime : 2021-05-12 16:42:31
 * @Website      : www.yilantingfeng.site
 * @E-mail       : gehrychiang@aliyun.com
 * @ProbTitle    : (记得补充题目标题)
 */
public class Main {
    public static void main(String[] args) {
        Running runner=new Running();
        Thread thread=new Thread(runner,"乌龟");
        Thread thread1=new Thread(runner,"兔子");
        thread.start();
        thread1.start();
    }
}
class Running implements Runnable{
    int N=100;
    int wugui=0;
    int tuzi=0;
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("乌龟")){
            for(;wugui<N;wugui+=1){
                System.out.print("乌龟 left "+(N-wugui)+" ");
                System.out.println(wugui>tuzi?"领先":"落后");
            }
            System.out.println("乌龟到达****************");
        }
        if(Thread.currentThread().getName().equals("兔子")){
            for(;tuzi<N;tuzi+=10){
                System.out.print("兔子 left "+(N-tuzi)+" ");
                System.out.println(tuzi>wugui?"领先":"落后");
                if(tuzi>wugui){
                    System.out.println("我跑得快，睡一觉");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("兔子到达**************************");
        }
    }
}