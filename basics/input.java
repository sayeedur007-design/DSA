import java.util.*;
public class input{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the arrray");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[0]);
    }
}