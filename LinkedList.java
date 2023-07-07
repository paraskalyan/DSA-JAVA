// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    
    LinkedList(){
        head = null;
    }
    
    void insertAtBeg(int value){
        Node newnode = new Node(value);
        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
}
    void insertMiddle(int value, int pos){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            return;
        }
        int count = 1;
        Node current = head;
        while(count != pos){
            current = current.next;
            count++;
        }
        newnode.next = current.next;
        current.next = newnode;
        
    }
    void insertEnd(int value){
        Node newnode = new Node(value);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newnode;
    }
    
    void deleteFirst(){
        head = head.next;
    }
    void deleteLast(){
        Node prev = null;
        Node current = head;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
    }
    void deleteMid(int pos){
        int count = 1;
        Node current = head;
        while(count != pos){
            current = current.next;
            count++;
        }
        
        current.next = current.next.next;
    }
    
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtBeg(30);
        list.insertAtBeg(40);
        list.insertAtBeg(50);
        list.insertMiddle(33, 4);
        list.insertEnd(100);
        list.display();
        list.deleteMid(4);
        
        list.display();
        // Node node1 = new Node(10);
        // Node node2 = new Node(20);
        // Node node3 = new Node(30);
        // Node node4 = new Node(40);
        
        // node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;
        // Node head = node1;
        // Node temp = head;
        
        // insertAtBeg(50, head);
        
    }
}
