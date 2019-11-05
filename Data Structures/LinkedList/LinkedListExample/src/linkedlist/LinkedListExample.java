package linkedlist;

public class LinkedListExample 
{
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.createNode(2);
        list.createNode(43);
        list.createNode(64);
        list.createNode(1);
        list.createNode(23);
        
        list.printNodes();
        System.out.println();
        System.out.println("Reversing the Linked List order: ");
        list.recursiveReverseLinkedList(list.head);
        list.printNodes();
        
    }   
}
