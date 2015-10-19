package DataStructure.List;

import DataStructure.DataStructure;
import DataStructure.Node.Node;
import DataStructure.Node.NullNode;

/**
 * Created by klieart on 9/20/15.
 */
public abstract class List<T> {

    Node<T> head;
    public Node<T> iter;

    List(){
        head = new NullNode<T>();
        iter = head;
    }

    // Iterator setters and getters
    public void setIter(Node<T> iter) { this.iter = iter; }
    public Node<T> getIter() { return iter; }

    // Abstract logic to set/add/insert/push node into list
    void setNode( Node<T> iter, Node<T> node ){
        node.next( iter.next() );
        iter.next( node );
    }
    public void insert( Node<T> node ){ return; }
    public void push( Node<T> node ){ return; }

    // Abstract logic to get/remove/delete/pop node from list
    void getNode( Node<T> iter ){
        Node<T> next = iter.next();
        if ( next.value != null ) {
            Node<T> nextNext = next.next();
            if ( nextNext.value != null ) { iter.next( nextNext ); }
            else { iter.next(null); }
            next.next(null);
        }
    }
    public Node<T> delete(){ return null; }
    public Node<T> pop(){ return null; }
}

