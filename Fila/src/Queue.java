public class Queue {
    private Node firstNode;
    private Node lastNode;
    private int count;

    public Queue() {
        this.firstNode = null;
        this.lastNode = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public boolean isEmpty(){
        return firstNode == null;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void enqueue(String data) {
       Node insertNode = new Node(data);
       if(this.count == 0) {
           this.firstNode = this.lastNode = insertNode;
       } else {
           this.lastNode.setNext(insertNode);
           this.lastNode = insertNode;
       }
       this.count++;
    }

    public Node dequeue(){
      if(this.isEmpty()) return null;
      Node removedNode = this.getFirstNode();
      this.setFirstNode(removedNode.getNext());
      this.count--;

      if(this.isEmpty()) {
          this.lastNode = null;
      }
      return removedNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return "Fila vazia!!";
        }
        String response = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\nImprimindo a fila \n\n";
        Node aux = this.firstNode;
        while(aux != null) {
            response += "Dado: " + aux.getData() + "\n";
            aux = aux.getNext();
        }
        response += "------------------------\n";
        response += "Total de itens: " + this.getCount() + "\n\n";
        response += "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        return response;
    }
}
