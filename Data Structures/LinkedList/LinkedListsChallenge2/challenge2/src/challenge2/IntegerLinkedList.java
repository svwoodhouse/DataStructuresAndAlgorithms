package challenge2;

public class IntegerLinkedList {
    
    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        // Checks to see if list is empty
        if(isEmpty()){
            addToFront(value);
            size++;
        }
        
        else
        {
            IntegerNode temp = head;
            IntegerNode newNode = new IntegerNode(value);
            while(temp.getValue() < value && temp.getNext() != null){
                temp = temp.getNext();
            }

            if(temp == head) {
                newNode.setNext(temp);
                head = newNode;
            }
            else {
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
            size++;
        }

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
