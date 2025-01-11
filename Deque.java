import java.util.*;
public class Deque {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayDeque<Integer>ad=new ArrayDeque<>();
        int choice;
        do{
            System.out.print("1.insert at beg\n2.insert at end\n3.delete from beg\n4.delete from end\n5.search element\n6.display elements\n");
            System.out.print("enter the choice :");
            choice=sc.nextInt();
            switch(choice){
            case 1:System.out.print("enter the element :");
            int element=sc.nextInt();
            ad.addFirst(element);
            break;
            case 2:System.out.print("enter the element :");
            int ele=sc.nextInt();
            ad.addLast(ele);
            break;
            case 3:
            ad.removeFirst();
            break;
            case 4:
            ad.removeLast();
            break;
            case 5:System.out.print("search the element :");
            int search=sc.nextInt();
            if(ad.contains(search)==true){
                System.out.println("element found ");
            }
            else{
                System.out.println("element not found ");
            }
            break;
            case 6:
            
                System.out.println(" " + ad);
            
            break;
            default:
                System.out.println("invalid choice please enter the choice between 1 to 6");
            }

        }while(choice<7);;
    }
}
