package lowerpart.mythread.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while(true){
                //不断从阻塞队列中获取面条
                try {
                    String food = queue.take();
                    System.out.println("开吃!!!"+food);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
