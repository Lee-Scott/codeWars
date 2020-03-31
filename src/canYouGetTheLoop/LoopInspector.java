package canYouGetTheLoop;

public class LoopInspector {
    public int loopSize(Node node) {
        Node baseNode = node;
        Node testNode = node.getNext();

        while (baseNode != testNode)
        {
            baseNode = baseNode.getNext();
            testNode = testNode.getNext().getNext();
        }

        int loopSize = 0;

        do {
            testNode = testNode.getNext();
            loopSize++;
        } while (baseNode != testNode);

        return loopSize;
    }

}
