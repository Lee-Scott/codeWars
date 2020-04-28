package nodes;

public class BinaryTree {

    Node root;

    // ...

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

    private void add(int i) {
    }

    public boolean containsNode(int i) {
        return true;
    }
}