import java.io.*;

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
        System.out.println();
    }


    //search for a node 

    public void search(int key){

        Node temp_node = head;

        while(temp_node != null){
            if(temp_node.data == key){
                System.out.println("Node found!");
                return;
            }
            temp_node = temp_node.next;
        }
        System.out.println("Node not found!");
    }


    //delete first node
    
    public void deleteFirst(){

        head = head.next;
    }


    //delete last node

    public void deleteLast(){

        Node temp_node = head;

        while(temp_node.next.next != null){
            temp_node = temp_node.next;
        }

        temp_node.next = null;

    }


    // delete a node after a given node 

    public void deleteAfter(Node prev_node){

        prev_node.next = prev_node.next.next;
    }


    //delete a node having first occurance of the given key

    public void deleteKey(int key){

        Node temp_node = head;
        Node prev_node = null;

        if (temp_node != null && temp_node.data == key){
            head = temp_node.next;
        }
        else{
            while(temp_node.data != key){
            prev_node = temp_node;
            temp_node = temp_node.next;
            }

            if(temp_node == null){
                System.out.println("Given key does not exist");
                return;
            }
            prev_node.next = temp_node.next;
        }    
    }


    // delete a node at a given position

    public void deleteNodeAtPostion(int position){

        Node temp_node = head;
        Node prev_node = null;

        if(position == 0 && temp_node!= null){
            head = temp_node.next;
            return;
        }

        for(int i=0; temp_node!=null && i<position-1; i++){
            prev_node = temp_node;
            temp_node = temp_node.next;
        }
        prev_node.next = temp_node.next;


    }
    

    //delete list

    public void deleteList(){

        head = null;
    }


    //find middle element of a linked list
    public void findMiddle(){

        Node slow_ptr = head;
        Node fast_ptr = head;
        if(head != null){
            while(fast_ptr !=null && fast_ptr.next!=null){
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is ["+slow_ptr.data+"]");
        }        
    }

    public static void main(String args[])throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        LinkedList list = new LinkedList();
        list.append(4);
        list.push(2);
        list.push(1);
        list.append(5);
        list.append(6);
        list.insertAfter(list.head.next, 3);

        System.out.println("\nCreated linked list is: ");
        list.printList();

        // System.out.println("Enter a key to search");
        // int key = Integer.parseInt(in.readLine());
        // list.search(key);

        // System.out.println("Deleting first node...");
        // list.deleteFirst();
        // list.printList();

        // System.out.println("Deleting last node...");
        // list.deleteLast();
        // list.printList();

        // System.out.println("Deleting after a node...");
        // list.deleteAfter(list.head.next);
        // list.printList();

        // System.out.println("Deleting a given key...");
        // list.deleteKey(2);
        // list.printList();

        // System.out.println("Enter a position \n");
        // int pos = Integer.parseInt(in.readLine());
        // System.out.println("Deleting a node at a given position...");
        // list.deleteNodeAtPostion(pos);
        // list.printList();
        
        // System.out.println("Deleting linked list...");
        // list.deleteList();

        list.findMiddle();
    }
}