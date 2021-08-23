public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue("primeiro dado");
        myQueue.enqueue("Outro dado");
        System.out.println(myQueue);
        System.out.println("Removendo da Fila: " + myQueue.dequeue());
        System.out.println(myQueue);
        myQueue.enqueue("Primeiro dado de novo");
        System.out.println(myQueue);
    }
}
