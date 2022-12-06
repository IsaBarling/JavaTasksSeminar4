import java.util.*;
  
public class LinkedListTest1 {
    public static void main(String[] args)
    {
        // Declaring linkedlist without any initial size
        LinkedList<String> linkedli = new LinkedList<String>();
        // Appending elements at the end of the list
        linkedli.add("Audi");
        linkedli.add("Cherry");
        linkedli.add("BMW");
        System.out.print("Elements before reversing: " + linkedli + "\n" );
        
        linkedli = reverseLinkedList(linkedli);
        System.out.print("Elements after reversing: " + linkedli);
    }
  
    
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
  
            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
}