import java.util.*;

class PalindromeLL
{
    public static void main(String args[])
    {
        //Creating linked list
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome(one);
        System.out.println("isPalindrome : "+condition);
    }

    static boolean isPalindrome(Node head)
    {
        Node ptr = head;
        boolean isPalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while(ptr != null)
        {
            stack.push(ptr.data);
            ptr = ptr.next;
        }

        while(head != null)
        {
            int item = stack.pop();
            if(head.data == item)
            {
                isPalin = true;
            }
            else
            {
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }
}

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