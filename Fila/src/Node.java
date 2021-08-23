public class Node {
    private String data;
    private Node next;

    public Node() {
    }

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "data= '" + data + '\'';
    }
}
