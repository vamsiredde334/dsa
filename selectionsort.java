import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements to be in array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the elements in array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();

        }

        for(int i=0; i<n-1; i++){
            int minindex=i;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[minindex]){
                minindex=j;
                
                }
            }
            int temp = a[i];
    a[i] = a[minindex];
    a[minindex] = temp;
  System.out.println(a[i]);
        }
    }
}
