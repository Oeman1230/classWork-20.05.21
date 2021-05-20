package workFiles.preLastLesson;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Incremenator extends Thread {
    private volatile boolean mIsIncrement = true;

    //volatile - получение самого актуального значения с точки зрения потока
    //кэш мы использовать не будем
    private volatile boolean mFinish = false; //marker

    public void changeAction()
    {
        mIsIncrement =!mIsIncrement;
    }
    public void finish()
    {
        mFinish = true;
    }

    @Override
    public void run() {
        do {
            if(!mFinish == true)
            {
                if(mIsIncrement)
                {
                    Program.value++;
                    //AtomicInteger безопсный инт
                }
                else
                {
                    Program.value--;
                }
                System.out.println("current value: " +Program.value);
            }
            else
            {
                return;
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        while (true);

    }
}
