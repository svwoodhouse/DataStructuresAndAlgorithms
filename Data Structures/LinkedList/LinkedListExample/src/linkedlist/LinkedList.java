package linkedlist;

public class LinkedList
{
    Node head;
    
    public class Node
    {
        private int data;
        private Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    // This method creates the nodes and adds the new node onto the linked list
    public void createNode(int data)
    {
        if(this.head == null)
        {
            Node newNode = new Node(data);
            head = newNode;
        }
        
        else
        {
            Node newNode = new Node(data);
            Node tempNode = head;
            while(tempNode != null)
            {
                if(tempNode.next == null)
                {
                    tempNode.next = newNode;
                    break;
                }
                
                else
                    tempNode = tempNode.next;
            }
        }
    }
 
    // This function uses recussion to reverse the order of the Linked List Nodes
    public Node recursiveReverseLinkedList(Node n)
    {
        if(n.next == null)
        {
            head = n;
            return n;
        }
        
        else
        {
            Node prevNode = recursiveReverseLinkedList(n.next);
            prevNode.next = n;
            n.next = null;
            return n;
        }
    }
    // You are given two non-empty linked lists representing two non-negative integers. 
    // The digits are stored in reverse order and each of their nodes contain a single digit. 
    // Add the two numbers and return it as a linked list.
    // You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    public void addNodes(Node node1,Node node2, int num)
    {
    }
    // This function prints the nodes 
    public void printNodes()
    {
        if(head == null)
            System.out.println("Empty List");
        
        else
        {
            Node tempNode = head;
            int i = 0;
            
            while(tempNode!= null)
            {
                System.out.println("Node " + i + ": " + tempNode.data);
                i++;
                tempNode = tempNode.next;
            }
                
        }
    }
}
