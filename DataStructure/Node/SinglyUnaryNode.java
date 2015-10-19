package DataStructure.Node;

/**
 * Created by klieart on 9/26/15.
 */
public class SinglyUnaryNode<T> extends Node<T> {

    // Constructors:
    public SinglyUnaryNode(T value){
        super(value);
        nodeConstructor(0, 1); }

    // Setters:
    public void next( Node<T> node) { setChild(0, node); }

    // Getters:
    public Node<T> next() { return getChild(0); }

}
