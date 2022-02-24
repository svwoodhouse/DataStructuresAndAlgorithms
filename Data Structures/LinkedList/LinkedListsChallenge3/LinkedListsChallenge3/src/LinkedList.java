public class LinkedList {
    Node head;

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     public void addNode (int data) {
        if(this.head == null){
            this.head = new Node(data);
        }
        else {
            Node tempNode = this.head;
            while(tempNode != null){
                if(tempNode.next == null){
                    Node newNode = new Node(data);
                    tempNode.next = newNode;
                    break;
                }
                else{
                tempNode = tempNode.next;
            }
        }
    }
}

    void printLinkedList(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.print("NULL");
    }
}
