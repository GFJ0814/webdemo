package 面试宝典;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by acer on 2017/3/27.
 * 18:56
 */
public class Threads {

    public static void main(String[] args) throws  Exception{
       /* for (int i = 0; i < 2; i++) {

            Thread thread = new Thread(new ThreadTest02());
            thread.start();

            ExecutorService executorService = Executors.newFixedThreadPool(5);
//            executorServic

        }*/

        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        FutureTask<String> task1 = new FutureTask(mt1);
        FutureTask<String> task2 = new FutureTask(mt2);//取得call()返回结果
        //FutureTask是Runnable接口子类，所以可以使用Thread类的构造接收task对象
        new Thread(task1).start();//启动多线程
        new Thread(task2).start();
        //多线程执行完毕后，依靠FutureTask的父接口Future中的get()方法完成
        System.out.println("A线程的返回结果：" + task1.get());
        System.out.println("B线程的返回结果：" + task2.get());

    }


    //继承Thread类从而实现线程
    static class ThreadTest01 extends Thread {
        @Override
        public void run() {
            System.out.println(currentThread().getName());
        }
    }
    //利用实现Runable接口创建线程
    static class ThreadTest02 implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    //实现Callale接口，实现Call方法，可以抛异常，待返回值
    static class ThreadTest03 implements Callable<String> {
        public String call() throws Exception {
            return "hello" + "world";
        }
    }

    static  class MyThread implements Callable<String>    {
        private int ticket = 10;

        public String call() throws Exception {
            for(int x = 0 ;x < 10 ;x ++) {
                if(this.ticket > 0) {
                    System.out.println("卖票,ticket = " + this.ticket --);
                }
            }
            return "票已卖光";
        }



    }
}
