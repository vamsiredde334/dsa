import java.util.Scanner;
public class lifirst {
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
        boolean find=false;
        for(int i=0; i<a.length; i++){
            if(a[i]==search){
                System.out.println("the element "+search+" first occured at index "+i);
                find=true;
                break;
                
            }
        
        }if(!find){
            System.out.println("Element not found");
        }
    }
}