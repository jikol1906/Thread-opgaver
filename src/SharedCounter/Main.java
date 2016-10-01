package SharedCounter;

/**
 * Created by borisgrunwald on 29/09/2016.
 */
public class Main {

    static int counter = 0;


    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {

            Thread t = new Thread(new Runnable() {

                @Override
                public void run() {

                    for(int i = 0; i < 10; i++) {
                        increment();
                    }

                }
            });

            t.start();

        }

        System.out.println(counter);

    }

    public static void increment() {
        counter++;
    }

}
