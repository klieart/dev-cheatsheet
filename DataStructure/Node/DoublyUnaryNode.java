package DataStructure.Node;

/**
 * Created by klieart on 9/26/15.
 */
public class DoublyUnaryNode<T> extends Node<T> {

    // Constructors:
    public DoublyUnaryNode(T value){
        super(value);
        nodeConstructor(1, 1); }

    // Setters:
    public void prev( Node<T> node) { setParent(0, node); }
    public void next( Node<T> node) { setChild(0, node); }

    // Getters:
    public Node<T> prev() { return getParent(0); }
    public Node<T> next() { return getChild(0); }

}
