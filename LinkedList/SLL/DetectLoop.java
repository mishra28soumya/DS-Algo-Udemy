import java.util.*;

class DetectLoop
{

    static Node head;

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

    static public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //Detect loop using hashing
    static boolean detectLoopHashing(Node h)
    {
        HashSet<Node> s =new HashSet<Node>();
        while(h!=null)
        {
            if(s.contains(h))
            {
                return true;
            }
            s.add(h);
            h = h.next;
        }
        return false;
    }

    //detect loop using flyod'd cycle finding algorithm
    static boolean detectLoopFlyod(Node h)
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
        while(slow_ptr!=null && fast_ptr!=null && fast_ptr.next!=null)
        {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr)
                return true;
        }
        return false;
    }

    //finding the number of nodes in a loop
    static int countNodes(Node n)
    {
        int res = 1;
        Node temp = n;
        while(temp.next != n)
        {
            res++;
            temp = temp.next;
        }
        return res;
    }

    static int countNodesInLoop(Node list)
    {
        Node slow_ptr = list, fast_ptr = list;
        while(slow_ptr != null && fast_ptr != null && fast_ptr.next !=null)
        {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr)
                return countNodes(slow_ptr);
        }
        return 0;
    }

    public static void main(String args[])
    {
        DetectLoop list = new DetectLoop();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        //creating a loop
        list.head.next.next.next.next = list.head;

        if(detectLoopHashing(head))
        {
            System.out.println("Loop found (Hashing)");
        }
        else
        {
            System.out.println("Loop not found (Hashing)");
        }

        if(detectLoopFlyod(head))
        {
            System.out.println("Loop found (Flyod)");
        }
        else
        {
            System.out.println("Loop not found (Flyod)");
        }

        System.out.println("The number of nodes in loop : "+countNodesInLoop(head));


    }
}