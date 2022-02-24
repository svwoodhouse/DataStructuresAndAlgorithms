public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LinkedList ll = new LinkedList();
        ll.addNode(2);
        ll.addNode(3);
        System.out.println("");
        ll.printLinkedList();
        ll.addNode(7);
        ll.printLinkedList();
    }
}
