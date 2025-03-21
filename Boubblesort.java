import java.util.Scanner;
public class Boubblesort{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.println("enter the size of array");
    size =sc.nextInt();
    int []array=new int[size];
    System.out.println("enter the elements");
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    for(int i=0;i<size-1;i++){
        for(int j=0;j<size-i-1;j++){
            if(array[j]>array[j+1]){
                int temp= array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                
            }
        }
    }
    System.out.println("array after sorting");
    for(int i=0;i<size;i++){
        
        System.out.print("\t"+array[i]);
    }
    
}
}