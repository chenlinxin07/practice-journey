package lowerpart.mythread.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 放一个结束标记
        try {
            queue.put("结束");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
