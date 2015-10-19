package DataStructure.Node;

/**
 * Created by klieart on 9/26/15.
 */
public class DoublyBinaryNode<T> extends Node<T> {

    // Constructors:
    public DoublyBinaryNode(T value){
        super(value);
        nodeConstructor(1, 2); }

    // Setters:
    public void parent( Node<T> node) { setParent(0, node); }

    public void right( Node<T> node){ setChild(1, node); }
    public void next( Node<T> node) { setChild(1, node); }
    public void left( Node<T> node) { setChild(0, node); }
    public void prev( Node<T> node) { setChild(0, node); }

    // Getters:
    public Node<T> parent() { return getParent(0); }

    public Node<T> right(){ return getChild(1); }
    public Node<T> next() { return getChild(1); }
    public Node<T> left() { return getChild(0); }
    public Node<T> prev() { return getChild(0); }

}
