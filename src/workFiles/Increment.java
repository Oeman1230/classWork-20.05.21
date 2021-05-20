package workFiles;

public class Increment implements Runnable {
    private CommonResource resource;
    @Override
    public void run() {
        resource.x = 1;
        for(int i=0; i < 5; i++)
        {
            System.out.println(String.format("Thread name is", Thread.currentThread().getName(), resource));
            resource.x++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public Increment(CommonResource commonResource)
    {
        this.resource = commonResource;
    }
}
