package doublelinkedlist;

public class DoubleLinkedListExample 
{
    public static void main(String[] args) 
    {
       DoubleLinkedList list = new DoubleLinkedList();
       list.addNode("Jane");
       list.addNode("John");
       list.addNode("Mary");
       list.addNode("Mike");
       list.printNodes();
    }  
}
