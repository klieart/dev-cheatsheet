package test;

import sun.security.util.BigInt;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by klieart on 9/25/15.
 */
public class Fibonacci {

    int[] cacheArr;
    Map<Long,BigInteger> cache;

    // --------------------------------------------------
    // CONSTRUCTOR
    public Fibonacci(){
        cache = new HashMap<Long,BigInteger>();
        cache.put( 0L, new BigInteger("0") ); // f(0) = 0
        cache.put( 1L, new BigInteger("1") ); // f(1) = 1
        cache.put( 2L, new BigInteger("1") ); // f(2) = 1
    }

    // --------------------------------------------------
    // TEXTBOOK FIBONACCI IMPLEMENTATION
    // f(5) = f(4) + f(3) = 3+2 = 5
    // f(4) = f(3) + f(2) = 2+1 = 3
    // f(3) = f(2) + f(1) = 1+1 = 2
    // f(2) = f(1) + f(0) = 1

    public int traditional( int i, boolean isCached ){
        if( i < 2 ) { return i; }
        if (isCached) {
            cacheArr = new int[ i+1 ];
            cacheArr[1] = 1;
            cacheArr[2] = 1;
            return fB( i );
        } else {
            return fA( i );
        }
    }
    // Fib Recursive w/o Caching ~ T:O(2^N), S:O(N)
    int fA( int i ) {
        if( i < 2 ) { return i; }
        return fA( i-1 ) + fA( i-2 );

    }
    // Fib Recursive w/ Caching (Memorization) ~ T:O(N), S:O(N)
    int fB( int i ) {
        if( cacheArr[i] == 0 ) { cacheArr[i] = fB( i-1 ) + fB( i-2 ); }
        return cacheArr[i];
    }

    // --------------------------------------------------
    // VARIED FIBONACCI IMPLEMENTATIONS

    // Fib Iterative w/ BigInt w/o Caching ~ T:O(N), S:O(1)
    public BigInteger iterative(long x) {
        long i = 2;
        BigInteger curr = new BigInteger("1"); // f(1)=1
        BigInteger prev = new BigInteger("1"); // f(2)=1
        // Base case: if x={0,1}, then f(x)={0,1}
        if ( x < i ) { curr =  new BigInteger( Long.toString( x ) ); }
        // For cases where x > 2
        else {
            while( i < x ){
                BigInteger next = curr.add( prev );
                prev = curr;
                curr = next;
                i++;
            }
        }
        return curr;
    }

    // Fib Iterative w/ BigInt w/ Caching ~ T:O(N), S:O(N)
    public BigInteger iterativeCached(long x) {
        long i = 2;
        // Base case: if x={0,1}, then f(x)={0,1}
        if ( x < i ) { return cache.get( x ); }
        // For cases where x > 2
        else {
            while( i < x ){
                i++;
                cache.put( i, cache.get( i - 1L ).add( cache.get( i - 2L ) ) );
            }
        }
        return cache.get( i );
    }

    // Fib Recursive w/ BigInt w/ Caching ~ T:O(N), S:O(N)
    public BigInteger recursive(long key) {
        if( cache.get( key ) == null ) {
            cache.put( key, new BigInteger( recursive( key - 1L ).add( recursive( key - 2L ) ).toString() ) );
        }
        return cache.get( key );
    }

    /* Amazon Code Challenge ~ Fibonacci Factor
    INPUT:
         Given int[] TestCases = {K_1, .., K_N) where K > 1.
         1 <= T <= 5
         2 <= K <= 1,000,000
         EXAMPLE: int[] T = { {3}, {3}, {5}, {161} };
    OUTPUT:
         F = smallest fibonacci number.
         D = smallest number > 1 which divides both K and F.
         EXAMPLE: T = { {3,3}, {5,5}, {21,7} };   where {F,D}
    */
    public long[][] factor( long[][] T ){
        // Find factors (1 <= T <= 5)
        for (int i = 0; i < T.length; i++) {
            long K = T[i][0];
            // Pre-warm fibonacci cache
            iterativeCached( K );
            // Get smallest common factor
            T[i] = getFactor(K);
        }
        return T;
    }

    long[] getFactor( long K ){

        // Find F, the first fibonacci that is a factor
        BigInteger cacheK = cache.get( K );
        long F = 0;

        long i = 2;

        while ( i <= K ) {
            if ( cacheK.mod( cache.get( i ) ).equals( 0 ) ) {
                F = cache.get( i ).longValue();
                break;
            }
            i++;
        }

        BigInteger cacheF = cache.get( F );
        long D = 0;

        // Look back and find lowest common factor
        while ( i > 0 ) {
            if ( cacheK.mod( cache.get( i ) ).equals( 0 ) ) {
                D = cache.get( i ).longValue();
                break;
            }
            i--;
        }
        return new long[] {F, D};
    }
}
