package DataStructure.Tree;

import DataStructure.Node.*;

/**
 * Created by klieart on 9/26/15.
 */
abstract class BinaryTree {

    Node root;
    Node iter;

    public BinaryTree() {
        this.root = new NullNode();
        this.iter = this.root;
    }

    private void moveIter() {

        if (iter == null) {

        }
    }

    public void insert( Node node ) {
        if( iter.left() == null ) {
            iter.left( node );
        }
        if( iter.right() == null ) {
            iter.right( node );
        }
        moveIter();
    }

    public void delete(){
    }

    public Node search( Node node ){

        if ( node == null ) { return null; }
        else {

            Node left = search( node.prev() );
            Node right = search( node.next() );
            /*
            if ( left.value > node.value ) {
                //swap
            }
            if ( right.value > node.value ) {
                //swap
            }*/
            return node;
        }
    }
}
