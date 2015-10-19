package test;

import DataStructure.Node.*;
import com.sun.tools.internal.xjc.reader.dtd.bindinfo.BindInfo;

import java.math.BigInteger;
import java.util.Map;
import java.util.Set;

/**
 * Created by klieart on 3/4/15.
 */
public class Test {
    public static void main(String[] args){

        //palindrome();

        factors();

        fibonacci();

        //node();

        //binaryTree();

    }

    static void binaryTree() {
        Node root;

        //BinaryTree bt = new BinaryTree();

    }

    static void node() {
        Node nodeA = new DoublyUnaryNode( 5 );
        Node nodeB = new DoublyBinaryNode( 3 );

        nodeA.next(nodeB);
        nodeB.prev(nodeA);

        System.out.println("nodeA <--> nodeB:");
        System.out.println("nodeA's val: " + nodeB.value );
        System.out.println("nodeB's val: " + nodeA.value );

        System.out.println("Calling neighbor (prev/next) node:");
        System.out.println("nodeA's val from nodeB: " + nodeB.prev().value );
        System.out.println("nodeB's val from nodeA: " + nodeA.next().value );

        System.out.println("Graceful handling of out-of-bound:");
        System.out.println("nodeA prev: " + nodeA.prev().value );
        System.out.println("nodeB next: " + nodeB.next().value );
    }

    static void fibonacci() {
        Fibonacci fib = new Fibonacci();
        long index = 20;
        int valueInt = 0;
        BigInteger value = null;
        long startTime = 0;
        long endTime = 0;

        // Traditional Fib (w/o caching)
        if ( index <= 40 ) { //Disable if index is above 40. Becomes too slow...
            startTime = System.nanoTime();
            valueInt = fib.traditional( (int)index, false);
            endTime = System.nanoTime();
            System.out.println( "fib.traditional("+ index +", false) = "+ valueInt + " ~ " + ((endTime-startTime)/1e6) + " ms" );
        } else {
            System.out.println( "fib.traditional("+ index +", false) = Disabled for index > 40 (TOO SLOW!)" );
        }

        // Traditional Fib (w/ caching)
        startTime = System.nanoTime();
        valueInt = fib.traditional( (int)index, true);
        endTime = System.nanoTime();
        System.out.println( "fib.traditional("+ index +", true) = "+ valueInt + " ~ " + ((endTime-startTime)/1e6) + " ms" );

        // Recursive Fib (w/ caching)
        startTime = System.nanoTime();
        value = fib.recursive(index);
        endTime = System.nanoTime();
        System.out.println( "fib.recursive("+ index +") = "+ value + " ~ " + ((endTime-startTime)/1e6) + " ms" );

        // Iterative Fib
        startTime = System.nanoTime();
        value = fib.iterative(index);
        endTime = System.nanoTime();
        System.out.println( "fib.iterative("+ index +") = "+ value + " ~ " + ((endTime-startTime)/1e6) + " ms" );


        // Fibonacci Factors
        int x = 300;
        startTime = System.nanoTime();
        value = fib.iterativeCached( x );
        endTime = System.nanoTime();
        System.out.println( "fib.factor("+ x +") = "+ value + " ~ " + ((endTime-startTime)/1e6) + " ms" );
        System.out.println( "fib.factor("+ x +") = 222232244629420445529739893461909967206666939096499764990979600" );
    }

    static void factors() {
        long num = 161;
        Fibonacci fib = new Fibonacci();
        Factors f = new Factors();

        // Calculate fib for given num
        BigInteger numFib = fib.iterative( num );

        // Calculate prime factors of num
        Map<Long,Long> primeSet = f.primeFactors( num );
        f.printPrimes( primeSet );

        // Calculate fib for each prime AND verify if divisible my fib of num
        BigInteger[] primeFib = new BigInteger[ primeSet.size() ];
        int i = 0;
        for ( long prime : primeSet.keySet() ) {
            primeFib[i] = fib.iterative( prime );
            // TODO: Finish the code to get the min prime factor for the fib
            System.out.println( "FIB: " + primeFib[i] );
            i++;
        }
    }

    static void palindrome() {
        Palindrome p = new Palindrome();

        String s = "ABCD";

        String even = p.build( s );
        p.validate( even );
        System.out.println( "Q: Is "+ even +" a palindrome?\nA: " + p.validate( even ) );

        String odd = p.build( s, false );
        p.validate( odd );
        System.out.println( "Q: Is "+ odd +" a palindrome?\nA: " + p.validate( odd ) );

        String failDiff = "ABC";
        p.validate( failDiff );
        System.out.println( "Q: Is "+ failDiff +" a palindrome?\nA: " + p.validate( failDiff ) );

        String failCase = "ABa";
        p.validate( failCase );
        System.out.println( "Q: Is "+ failCase +" a palindrome?\nA: " + p.validate( failCase ) );
    }
}