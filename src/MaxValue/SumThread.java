package MaxValue;

/**
 * Created by borisgrunwald on 28/09/2016.
 */
public class SumThread implements Runnable {

    int[] arr;
    int low;
    int max;
    int maxNum = 0;


    public SumThread(int[] arr, int low, int max) {
        this.arr = arr;
        this.low = low;
        this.max = max;
    }

    public int getMax() {
        return maxNum;
    }

    public void run() {



        for(int i = low; i < max; i++) {
            if(arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

    }
}
