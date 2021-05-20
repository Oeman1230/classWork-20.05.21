package workFiles;

public class Producer implements Runnable {
    private Shop shop;
    public Producer(Shop shop)
    {
        this.shop = shop;
    }
    @Override
    public void run() {
     for(int i=1; i < 6; i++)
     {
         shop.put();
     }
    }
}
