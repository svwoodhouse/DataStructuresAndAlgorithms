/*
 * Queue Class
 */
package queueexample;

import java.util.NoSuchElementException;

public class Queue 
{
    private static class Node {
        private int data;
        private Node next;
        private Node (int data){ 
            this.data = data; 
        }
    }
    
    private Node head; // remove from the head
    private Node tail; // add
    
    public boolean isEmpty()
    {
        return head == null;
    }
    
    public int peek()
    {
        if(head == null)
            throw new NoSuchElementException(); 
            
        return head.data;
    }
    
    public void enqueue(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            node.next = null;
        }
        
        else
        {
            Node temp = head;
            while(temp.next!= null)
            {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
        
    }
    
    public void dequeue()
    {
        if(head == null)
         throw new NoSuchElementException();  
        
        else
            head = head.next;
    }
    
    public void printQueue()
    {
        if(head == null)
            throw new NoSuchElementException();
        
        else
        {
            Node temp = head;
            System.out.print("{");
            while(temp != null)
            {
                if(temp.next == null)
                {
                    System.out.print(temp.data);
                    temp = temp.next;  
                }
                
                else
                {
                    System.out.print(temp.data + ",");
                    temp = temp.next;
                }
            }
            System.out.println("}");
        }
    }
}
