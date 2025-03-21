import java.util.Scanner;
public class Insertionsort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size =sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements of an array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&& arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println("array after the sorting ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

        
    }
}
