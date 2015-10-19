package ObserverPattern;

import java.util.ArrayList;

/**
 * Created by klieart on 9/25/15.
 */
public class ObserverTestRun {
    public static void main( String[] args ){
        ArrayList observers = new ArrayList();
        //Object x = new Test();
        Obs o1 = new Obs();
        observers.add(o1);
        Obs o2 = (Obs)observers.get(0);
        o2.print();
    }
}

class Obs {
    public void print(){
        System.out.println( "TODO: Review observer pattern and revise this test..." );
    }
}
