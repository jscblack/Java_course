/**
 * Created on 2021/6/7.
 *
 * @author Gehry chiang
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TikSellor tikSellor = new TikSellor();
        new Thread(tikSellor, "哈站").start();
        new Thread(tikSellor, "哈东站").start();
        new Thread(tikSellor, "哈西站").start();
    }
}

class TikSellor implements Runnable {
    int totTik = 200;

    @Override
    public void run() {
        while (totTik > 0) {
            synchronized (this) {
                if (totTik <= 0) {
                    System.out.println(Thread.currentThread().getName() + "已售票完毕");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "已出售第" + totTik + "张票.尚余票" + --totTik + "张");
                }
            }
        }
    }
}