package workFiles;

public class Shop {
    private int product = 0;
    public synchronized void get()
    {
        while (product<1)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            product--;
            System.out.println("client took product");
            System.out.println("on storage " + product);
            notify();
        }
    }
    public synchronized void put()
    {
        while (product >=3)
        {
            try {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            product++;
            System.out.println("add product");
            System.out.println("on storage" + product);
            notify();
        }
    }
}
