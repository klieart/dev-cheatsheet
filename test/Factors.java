package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by klieart on 10/1/15.
 */
public class Factors {

    // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101

    public Factors(){
        //prime.add(1L);
    }

    // --------------------------------------------------
    // GREATEST COMMON DIVISOR
    public long gcd(  ){
        return 0l;
    }

    // --------------------------------------------------
    // PRIME CALCULATOR FOR SMALL NUMBERS

    public Map<Long,Long> primeFactors( long num ) {
        Map<Long,Long> primeSet = new HashMap<Long, Long>();
        long prime = num;
        long i = 2;
        while( i < prime ) {
            if( prime % i == 0 ) {
                insertPrime( primeSet, i );
                prime /= i;
            } else {
                i++;
            }
        }
        insertPrime( primeSet, i );
        return primeSet;
    }
    void insertPrime( Map<Long,Long> primeSet, Long prime ) {
        long pow = 1;
        if( primeSet.containsKey( prime ) ) {
            pow += primeSet.get( prime );
        }
        primeSet.put( prime , pow );
    }

    // --------------------------------------------------
    // PRIME CALCULATOR FOR LARGE NUMBERS

    public Map<BigInteger,Long> primeFactorsBigInt( BigInteger num ) {
        Map<BigInteger,Long> primeSet = new HashMap<BigInteger, Long>();
        BigInteger prime = num;
        BigInteger i = new BigInteger("2");
        while( i.compareTo(prime) < 0) {
            if( prime.mod(i).equals( BigInteger.ZERO ) ) {
                insertPrimeBigInt( primeSet, i );
                prime = prime.divide(i);
            } else {
                i = i.add(new BigInteger("1"));
            }
        }
        insertPrimeBigInt( primeSet, i );
        return primeSet;
    }
    void insertPrimeBigInt( Map<BigInteger,Long> primeSet, BigInteger prime ) {
        long pow = 1;
        if( primeSet.containsKey( prime ) ) {
            pow += primeSet.get( prime );
        }
        primeSet.put( prime , pow );
    }

    // --------------------------------------------------
    // PRIME PRINTER

    public void printPrimes( Map<Long,Long> primeSet ) {
        String set = "1";
        for ( Long prime : primeSet.keySet() ) {
            set += " * " + prime + "^" + primeSet.get( prime );
        }
        System.out.println( "primeSet = " + set );
    }

    public void printPrimesBigInt( Map<BigInteger,Long> primeSet ) {
        String set = "1";
        for ( BigInteger prime : primeSet.keySet() ) {
            set += " * " + prime + "^" + primeSet.get( prime );
        }
        System.out.println( "primeSet = " + set );
    }
}
