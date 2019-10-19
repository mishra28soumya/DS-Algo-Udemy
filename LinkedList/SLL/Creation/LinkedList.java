class LinkedList{

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }


    //Add a new node at the front of the linkedList

    public void push(int new_data){

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    //Add a new node after a given previous node

    public void insertAfter(Node prev_node, int new_data){
    
        if(prev_node == null){
            System.out.println("The given previous node cannot be null");
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    //Append a new node at the end

    public void append(int new_data){

        Node new_node = new Node(new_data);

        if(head==null){
            head = new_node;
        }else{
            Node last = head;

            while(last.next != null){
                last = last.next;
            }

            last.next = new_node;
        }

        
        
    }

    public void printList(){
        Node temp_node = head;
        while(temp_node != null){
            System.out.print(temp_node.data+" ");
            temp_node  =temp_node.next;
        }
    }

    public static void main(String args[]){
        System.out.println("Start");
        LinkedList list = new LinkedList();
        list.append(4);
        list.push(2);
        list.push(1);
        list.append(5);
        list.insertAfter(list.head.next, 3);

        System.out.println("\nCreated linked list is: ");
        list.printList();
    }
}