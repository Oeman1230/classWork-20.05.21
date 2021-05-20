package workFiles.preLastLesson;

import workFiles.Consumer;
import workFiles.Producer;
import workFiles.Shop;

public class Program {
    public static Integer value = 0;

    public static void main(String[] args) {/*
        Incremenator incremenator = new Incremenator();
        //incremenator.setPriority(Thread.NORM_PRIORITY); - поменять приоритет
        incremenator.isAlive();
        incremenator.isDaemon();
        incremenator.isInterrupted(); //будет ли прерван поток или не будет прерван
        incremenator.setName("a");
        incremenator.getId();
        incremenator.interrupt(); //сообщить потоку о том, что нужно его прервать

        System.out.println("start value" + value);
        incremenator.start();
        // интервал сколько будет действовать инкрементатор
        for(int i = 1; i <= 3; i++)
        {
            try{
                Thread.sleep(i*2*1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            incremenator.changeAction();

        }
        incremenator.finish();
        //Thread.yield(); переключиться на другие потоки. При задержке выполнения (долгий процесс)*/
    /*CommonResource commonResource = new CommonResource();
    Object.class.notify(); // метод сообщает другим потокам о своим действиях. Будит другой поток
    for(int i = 1; i<6; i++)
    {
        Thread t = new Thread(new Increment(commonResource));
        t.setName("thread " + i);

        t.start();
    }
    }*/
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
