import java.util.Scanner;
public class lifound{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements to be in array : ");
    int n=sc.nextInt();
    int[] a=new int[n];
    boolean find=false;
    System.out.println("Enter the Element");
    for(int i=0; i<a.length; i++){
    a[i]=sc.nextInt();
    }
    System.out.println("Enter a element in array to find the array : ");
    int num=sc.nextInt();
    for(int i=0; i<a.length; i++){
        if(a[i]==num){
            find=true;
            System.out.println("Element in array is found ");
            break;
        }
        
    }if(!find){
            System.out.println("Element is not found");
        }
}
}
