package workFiles.preLastLesson;

public class Program {
    public static Integer value = 0;

    public static void main(String[] args)
    {
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
        //Thread.yield(); переключиться на другие потоки. При задержке выполнения (долгий процесс)

    }
}
