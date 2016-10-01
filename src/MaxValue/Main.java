package MaxValue;

/**
 * Created by borisgrunwald on 28/09/2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {


        int[] arr = new int[100000000];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println(maxNum(arr));



    }

    public static int maxNum(int[] arr) throws InterruptedException {

        long start = System.currentTimeMillis();

        final int length = arr.length;
        int maxNum = 0;


        SumThread[] r = new SumThread[4];
        Thread[] t = new Thread[4];


        for (int i = 0; i < 4; i++) {

            r[i] = new SumThread(arr, (i * length) / 4, ((i + 1) * length / 4));
            t[i] = new Thread(r[i]);
            t[i].start();

        }



        for (int i = 0; i < 4; i++) {

            t[i].join();
            if(maxNum < r[i].getMax()) {
                maxNum = r[i].getMax();
            }

        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);


        return maxNum;



    }



}
