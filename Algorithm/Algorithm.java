package Algorithm;

import Algorithm.Sort.BubbleSort;
import Algorithm.Sort.MergeSort;

import java.util.Arrays;

/**
 * Created by klieart on 9/24/15.
 */
public class Algorithm {
    public static void main(String[] args){
        int[] arr = {6,1,3,2,8,9,7,4,0,5};
        printUnsorted( arr );
        bubbleSort( arr );
        mergeSort( arr );

        /*
        int left = 0;
        int right = 7;
        int mid = left + ( right - left ) / 2;
        System.out.println( "left range:  (" + left + "," + mid +")" );
        System.out.println( "right range: (" + (mid+1) + ","+ right +")" );
        */
    }

    static int[] copyArray( int[] arr ){
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    static void printUnsorted( int[] arr ){
        System.out.println( "Unsorted:    " + Arrays.toString(arr) );
    }

    static void bubbleSort( int[] arr ){
        BubbleSort bs = new BubbleSort();
        int[] copyArr = copyArray(arr);
        bs.sort( copyArr );
        System.out.println( "Bubble Sort: " + Arrays.toString(copyArr) );
    }
    static void mergeSort( int[] arr ){
        MergeSort ms = new MergeSort();
        int[] copyArr = copyArray(arr);
        System.out.println( "Merge Srt.B4:" + Arrays.toString(copyArr) );
        ms.sort( copyArr );
        System.out.println( "Merge Sort:  " + Arrays.toString(copyArr) );
    }
}