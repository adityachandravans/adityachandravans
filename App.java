import java.util.*;
public class App{
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
       int choice;
do{ 
    System.out.print("1.insert element\n2.delete element\n3.insert at given position\n4.delete from given position\n5.search\n6.display\n");
    System.out.print("enter the choice:");
   choice=sc.nextInt();
      switch(choice){
        case 1:System.out.print("enter the element :");
        int element=sc.nextInt();
        l1.add(element);
        break;
        case 2:System.out.print("enter the element at that position :");
        l1.remove(0);
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
        case 5:System.out.print("search the element :");
        int search=sc.nextInt();
        if(l1.contains(search)==true){
            System.out.println("element found ");
        }
        else{
            System.out.println("element not found ");
        }
        break;
        case 6:
        for(int i=0;i<l1.size();i++){
             System.out.println(l1.get(i));
        }
        break;
        default:
        System.out.println("invalid choice please enter the choice between 1 to 6");
      }
    }while(choice<7);
    }
}
