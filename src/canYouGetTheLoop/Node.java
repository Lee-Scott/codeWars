package canYouGetTheLoop;

import java.util.ArrayList;

// Though about implementing this "black box" but didnt

public class Node  {
    ArrayList<Node> arrayNode = new ArrayList<Node>();
    private static int before;
    private static int next;

    public static Node createChain(int i, int i1) {
        next = i;
        before = i1;
        return null;
    }


    public Node getNext() {
        return null;
    }
}
