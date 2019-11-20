//To remove duplicate elements from an unsorted linked list
import java.util.HashSet;

class DuplicateUnsorted
{

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //Using hashing
    static void removeDupicates(Node head)
    {
       HashSet<Integer> hs = new HashSet<>();
       Node current = head;
       Node prev = null;

       while(current!=null)
       {
           int currval = current.data;
           if(hs.contains(currval))
           {
               prev.next = current.next;
           }
           else
           {
               hs.add(currval);
               prev = current;
           }
           current = current.next;
       }
    }

    static void printList(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        Node start = new Node(10);
        start.next =new Node(12);
        start.next.next =new Node(12);
        start.next.next.next =new Node(11);

        removeDupicates(start);
        printList(start);


    }
}