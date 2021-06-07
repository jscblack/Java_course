/**
 * Created on 2021/6/7.
 *
 * @author Gehry chiang
 */

import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        CrossRiver crossRiver=new CrossRiver();
        List<String>personList=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            personList.add("Person "+Math.abs(new Random().nextInt())%100+1);
        }
        Collections.shuffle(personList);
        for (int i = 0; i < 10; i++) {
            new Thread(crossRiver,personList.get(i)).start();
        }
        System.out.println("过河人员随机完毕");
    }
}

class CrossRiver implements Runnable {

    @Override
    public void run() {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"开始过河");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.err.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"过河完毕");
        }
    }
}