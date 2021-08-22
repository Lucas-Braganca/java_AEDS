public class Node {
    private int data;
    private Node next = null;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getReferenceNode() {
        return next;
    }

    public void setReferenceNode(Node referenceNode) {
        this.next = referenceNode;
    }

    @Override
    public String toString() {
        return "dado=" + data;
    }
}
