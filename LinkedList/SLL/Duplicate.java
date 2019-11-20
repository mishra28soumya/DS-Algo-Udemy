//Remove the duplicates from a sorted linked list

class LinkedList
{

    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void removeDuplicates()
    {
        Node current = head;
        while(current != null)
        {
            Node temp = current;
            while(temp != null && temp.data == current.data)
            {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;    
            
        }
    }

    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printlist()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        LinkedList list = new LinkedList();
        list.push(20);
        list.push(13);
        list.push(13);
        list.push(11);
        list.push(11);
        list.push(11);
        list.push(11);

        System.out.println("List before removal of duplicates:");
        list.printlist();

        list.removeDuplicates();

        System.out.println("List after removal of duplicates");
        list.printlist();
    }
}
