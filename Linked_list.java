import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[]args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("python");
        list.add("C");
        list.add("C++");
        System.out.println("List is : "+list);

        // List in descending order
        Iterator i = list.descendingIterator();
        while(i.hasNext()){
            System.out.println("Reverse order is : "+i.next());
        }

        // Add first
        list.addFirst("HTML");
        System.out.println("Added in first : "+list);

        // Add Last
        list.addLast("CSS");
        System.out.println("Added in last : "+list);

        // Added in specific position
       list.add(3,"Jquey");
        System.out.println("Added in specific position : "+list);

        // remove
        list.remove("C");
        System.out.println("Removing list is : "+list);

        // removing in specific position
        list.remove(4);
        System.out.println("Removing element in the specific position : "+list);
    }
}
