//To remove duplicate elements from an unsorted linked list
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

    //Using hashing
    void removeDupicates()
    {
        Node ptr1 = head, ptr2 = null;

        while(ptr1 != null && ptr1.next !=  null)
        {
            ptr2 = ptr1;
            while(ptr2.next != null)
            {
                if(ptr2.data == ptr2.data.next)
                {
                    ptr2 = ptr2
                }
            }
        }
    }
}