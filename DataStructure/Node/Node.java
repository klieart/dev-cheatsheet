package DataStructure.Node;

/**
 * Created by klieart on 9/25/15.
 */
public abstract class Node<T> {

    public final T value;
    Node<T>[] parent;
    Node<T>[] child;

    // Constructors:
    Node() {
        this.value = null;
        this.parent = null;
        this.child = null;
    }
    public Node(T value) {
        this.value = value;
        this.parent = null;
        this.child = null;
    }
    void nodeConstructor( int parents, int children ){
        parent = new Node[ parents ];
        child = new Node[ children ];
    }

    // Setters:
    void setParent( int i, Node<T> node) { this.parent[i] = node; }
    void setChild( int i, Node<T> node ) { this.child[i] = node; }

    // Getters:
    Node<T> getParent( int i ) {
        if (this.parent[i] == null) { return new NullNode<T>(); }
        return this.parent[i];
    }
    Node<T> getChild( int i ) {
        if (this.child[i] == null) { return new NullNode<T>(); }
        return this.child[i];
    }

    // Public Methods (implemented selectively by children):
    public Node<T> parent(){ return null; }
    public void parent(Node<T> node){ return; };
    public Node<T> child(){ return null; };
    public void child(Node<T> node){ return; };
    public Node<T> right(){ return null; };
    public void right(Node<T> node){ return; };
    public Node<T> next(){ return null; };
    public void next(Node<T> node){ return; };
    public Node<T> left(){ return null; };
    public void left(Node<T> node){ return; };
    public Node<T> prev(){ return null; };
    public void prev(Node<T> node){ return; };

}
