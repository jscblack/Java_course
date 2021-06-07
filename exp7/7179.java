/**
 * Created on 2021/6/7.
 *
 * @author Gehry chiang
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        runRtTr RunRtTr = new runRtTr();
        Thread rabbit = new Thread(RunRtTr, "Rabbit");
        Thread tortoise = new Thread(RunRtTr, "Tortoise");
        rabbit.start();
        tortoise.start();
    }
}

class runRtTr implements Runnable {
    volatile int rbleftDistence = 100;
    volatile int toleftDistence = 100;

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Rabbit")) {
            while (rbleftDistence > 0) {
                if (toleftDistence <= rbleftDistence) {
                    System.out.println("Rabbit start run. Current leftDistance is " + rbleftDistence);
                    rbleftDistence -= 10;
                } else {
                    System.out.println("Rabbit take a rest. Current leftDistance is " + rbleftDistence + " ahead of Tortoise who is " + toleftDistence);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
            System.out.println("Rabbit Finish!");
        } else if (Thread.currentThread().getName().equals("Tortoise")) {
            while (toleftDistence > 0) {
                System.out.println("Tortoise start run. Current leftDistance is " + toleftDistence);
                toleftDistence -= 1;
            }
            System.out.println("Tortoise Finish!");
        }
    }
}