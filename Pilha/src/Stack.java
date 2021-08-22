public class Stack {

    Node topNode = null;

    public void push(Node newNode){
        Node auxNode = topNode;
        topNode = newNode;
        topNode.setReferenceNode(auxNode);
    }

    public Node pop(){
        if(!isEmpty()){
            Node popped = topNode;
            topNode = topNode.getReferenceNode();
            return popped;
        }
        return null;
    }

    public Node top(){
        return topNode;
    }

    public boolean isEmpty(){
        return topNode == null;
    }

    @Override
    public String toString() {
        String response = "Imprimindo a Pilha \n\n" ;
        Node auxNode = topNode;
        while(true){
            if(auxNode != null){
                response += "dado = " + auxNode.getData() + "\n";
                auxNode = auxNode.getReferenceNode();
            }else{
                break;
            }
        }
        return response;
    }
}
