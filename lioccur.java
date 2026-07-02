import java.util.Scanner;
public class lioccur {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a element you have to search");
        int search=sc.nextInt();
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==search){
                count++;
                
            }
        }
        if(count>0){System.out.println("the number "+search+" repeated "+count+" times");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
