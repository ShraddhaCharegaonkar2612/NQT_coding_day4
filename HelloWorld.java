/* Add an element to an array */
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
          int[] a={1,5,2,7,8,5,3};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        int n=a.length;
        n++;
        int[] x=new int[n];
        for(int i=0;i<a.length;i++)
        {
            x[i]=a[i];
        }
        System.out.println("enter element to add in array ");
        Scanner sc=new Scanner(System.in);
        
        x[n-1]=sc.nextInt();
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);
        }
    }
}