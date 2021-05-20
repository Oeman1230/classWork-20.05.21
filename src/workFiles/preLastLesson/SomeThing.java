package workFiles.preLastLesson;

public class SomeThing implements Runnable {


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0; i < 5; i++)
        {
            System.out.println(name + " Privet, it's additional stream. position " + i);
        }

    }
}
