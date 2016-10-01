package ReverseHallo;

/**
 * Created by borisgrunwald on 29/09/2016.
 */
public class Main {

    public static void main(String[] args) {

        Thread t = new Thread(new ReverseHallo());

        t.start();

    }


}
