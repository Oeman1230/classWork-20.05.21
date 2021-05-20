package workFiles.preLastLesson;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("program creates");
        //insert command from console

        SomeThing someThing = new SomeThing();
        Thread thread = new Thread(someThing, "stream1");
        thread.setDaemon(true);
        //Thread.stop(); scary thing. Kill thread;
        //сглаживающий механизм
        //Thread.interrupted();
        System.out.println(thread.isDaemon());
        //Thread thread2 = new Thread(someThing, "stream2");

        thread.start();
        //thread2.start();
        thread.join(); //stop before thread work
        //thread2.join(); //stop before thread work
        System.out.println("program ended");

    }
}
