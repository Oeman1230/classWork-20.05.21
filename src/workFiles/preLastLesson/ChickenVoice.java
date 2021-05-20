package workFiles.preLastLesson;

import java.util.concurrent.CountDownLatch;

public class ChickenVoice {

    public static void main(String[]args) throws InterruptedException {
        EggVoice eggVoice = new EggVoice();
        System.out.println("argue starts");
        eggVoice.start();

        for(int i=0; i < 10; i++)
        {
            Thread.sleep(1000);
            System.out.println("chicken");
        }

        if(eggVoice.isAlive())
        {
            eggVoice.join();
            System.out.println("egg create first");
        }
        else
        {
            System.out.println("chicken create first");
        }
        System.out.println("the end");
    }
}
