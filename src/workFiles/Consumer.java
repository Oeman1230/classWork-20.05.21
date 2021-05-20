package workFiles;

public class Consumer implements Runnable {
    private Shop shop;
    public Consumer(Shop shop)
    {
        this.shop = shop;
    }
    @Override
    public void run() {
        for(int i=1; i < 6; i++)
        {
            shop.get();
        }
    }
}
