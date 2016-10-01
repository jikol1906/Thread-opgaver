package ReverseHallo;

/**
 * Created by borisgrunwald on 28/09/2016.
 */
public class ReverseHallo implements Runnable {

    static int count = 0;
    int threadNumber = 0;


    public ReverseHallo() {
        count++;
        threadNumber = count;
    }


    @Override
    public void run() {

        while (count != 50) {

            Thread t = new Thread(new ReverseHallo());
            try {
                t.start();
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Hello from thread " + threadNumber + "!";
    }

}

