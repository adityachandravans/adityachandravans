import java.util.*;
public class Insertlink {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer>l1=new LinkedList<>();
        int choice;
        do{ 
            System.out.print("1.insert element\n2.delete element\n3.insert at given position\n4.delete from given position\n5.insert from end\n6.delete from end\n7.search\n8.display\n");
            System.out.print("enter the choice:");
           choice=sc.nextInt();
              switch(choice){
                case 1:System.out.print("enter the element :");
                int element=sc.nextInt();
                l1.addFirst(element);
                break;
                case 2:System.out.print("enter the element at that position :");
                l1.removeFirst();
                break;
                case 3:System.out.print("enter the position and element :");
                int position=sc.nextInt();
                int it=sc.nextInt();
                l1.add(position-1, it);
                break;
                case 4:System.out.print("enter the position :");
                int pos=sc.nextInt();
                l1.remove(pos-1);
                break;
                case 5:System.out.print("enter the element :");
                int ele=sc.nextInt();
                l1.addLast(ele);
                break;
                case 6:
                l1.removeLast();
                break;
                case 7:System.out.print("search the element :");
                int search=sc.nextInt();
                if(l1.contains(search)==true){
                    System.out.println("element found ");
                }
                else{
                    System.out.println("element not found ");
                }
                break;
                case 8:
                for(int i=0;i<l1.size();i++){
                     System.out.println(l1.get(i));
                }
                break;
                default:
                System.out.println("invalid choice please enter the choice between 1 to 6");
              }
            }while(choice<9);
    }
    
}
