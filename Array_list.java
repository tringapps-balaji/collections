import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        while (true) {
            System.out.println("1. Add 2. Remove 3. Display ");
            System.out.println("------------------------------");
            System.out.println("Enter the choice : ");
            int ch = sc.nextInt();
            if (ch>3){
                System.out.println("Invalid choice");
                System.exit(0);
            }

        switch (ch){
            case 1:
                System.out.println("Enter the Element : ");
                String ele = sc.next();
                arr.add(ele);
                System.out.println("Element is added ");
                break;

            case 2:
                System.out.println("Enter the Element : ");
                String Ele = sc.next();
            if (arr.contains(Ele)) {
                arr.remove(Ele);
                System.out.println("Element is Deleted");
            }
            else{
                System.out.println("Enter Correct Element ");
            }
            break;

            case 3:
                System.out.println("Element is : "+arr);
                break;
            }
        }
    }
}

