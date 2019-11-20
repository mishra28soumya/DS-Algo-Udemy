import java.util.*;

class PriorityQueueImplementation
{
    public static void main(String args[])
    {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        //adding items to the pQueue
        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");

        //Printing the element with heighest priority
        System.out.println("Head value using peek function: "+pQueue.peek());

        //Printing all elements
        System.out.println("The queue elements:");
        Iterator itr = pQueue.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        //Removing the top priority element
        pQueue.poll();
        System.out.println("After removing using poll:");
        Iterator itr2 = pQueue.iterator();
        while(itr2.hasNext())
            System.out.println(itr2.next());


        //Removing java
        pQueue.remove("Java");
        System.out.println("After removing Java:");
        Iterator itr3 = pQueue.iterator();
        while(itr3.hasNext())
            System.out.println(itr3.next());
        
        //check if an element is present
        boolean b = pQueue.contains("C");
        System.out.println("Priority queue contains C or not?: "+b);

        //Getting objects from the queue using toArray() in an array
        Object[] arr = pQueue.toArray();
        System.out.println("Value in array: ");
        for(int i=0; i<arr.length; i++)
            System.out.println("Value: "+arr[i]);

        Comparator pQueue_comp = pQueue.comparator();
        System.out.println("Priority queue comparator : "+pQueue_comp);

         
    }
}