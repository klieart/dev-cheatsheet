package Algorithm.Sort;

/**
 * Created by klieart on 9/20/15.
 */
public class BubbleSort {
    public void sort( int[] arr ){
        int arrLen = arr.length-1;
        for (int i = 0; i < arrLen; i++) {
            for (int j = 0; j < arrLen-i; j++) {
                if( arr[j] > arr[j + 1] ){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
