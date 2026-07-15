import java.util.Scanner;
public class copyarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements you want");
        int m=sc.nextInt();
        System.out.println("enter how many elements you want");
        int n=sc.nextInt();
        int[] a=new int[m];
        int[] b=new int[n];
        int[] c=new int[a.length+b.length];
        int k=0;
        System.out.println("enter the elements in a");
        for(int i=0; i<m; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the elements in b");
        for(int i=0; i<n; i++){
            b[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            c[k]=a[i];
            k++;
        }
        for(int i=0; i<n; i++){
            c[k]=b[i];
            k++;
        }System.out.println("elements in c are");
        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }
        
    }
    
}
