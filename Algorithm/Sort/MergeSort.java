package Algorithm.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by klieart on 9/20/15.
 */
public class MergeSort {

    int[] arr;
    int[] temp;
    int len;

    public void sort( int[] arr ) {
        this.arr = arr;
        this.temp = new int[arr.length];
        mergeSort( 0, arr.length-1 );
    }

    void mergeSort( int left, int right ) {
        if( left < right ) {
            int mid = left + ( right - left ) / 2;
            mergeSort( left, mid );
            mergeSort( mid+1, right );
            merge(left, mid+1, right);
        }
        //[6, 1, 3, 2, 8, 9, 7, 4, 0, 5]
        //[6, 1, 3, 2, 8][9, 7, 4, 0, 5]
        //[6, 1, 3][2, 8][9, 7, 4][0, 5]
    }

    void merge( int left, int mid, int right )
    {
        int midLeft = mid - 1;
        int k = left;
        int num = right - left + 1;

        while(left <= midLeft && mid <= right)
            if( arr[left] < arr[mid] )
                temp[k++] = arr[left++];
            else
                temp[k++] = arr[mid++];

        while(left <= midLeft) // Copy rest of first half
            temp[k++] = arr[left++];

        while(mid <= right)    // Copy rest of right half
            temp[k++] = arr[mid++];

        // Copy tmp back
        for(int i = 0; i < num; i++, right--)
            arr[right] = temp[right];
    }
}
