package doublelinkedlist;

public class DoubleLinkedList 
{
    private Node head;
    private Node tail;
    
    public class Node
    {
        private Node next;
        private Node previous;
        private String name;
        
        public Node(String name)
        {
            this.name = name;
        }
    }
        
        public void addNode(String name)
        {
            Node node = new Node(name);
            
            if(head == null)
            {
                head = node;
                node.next = null;
                tail = null;
            }
            
            else
            {
                Node tempNext = head;
                tempNext.previous = node;
                node.next = tempNext;
                head = node;
            }
        }
        
        public void printNodes()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(" " + temp.name + " -> ");
                if(temp.next == null)
                    break;
                            
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
            while(temp != null)
            {
                System.out.print("<- " + temp.name + " ");
                temp = temp.previous;
            }
            System.out.print("null");
        }
    }

