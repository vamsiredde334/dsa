import java.util.Scanner;
public class bicompare{
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
    int start=0;
    int end=a.length-1;
    boolean fd=false;
    int count=0;
    while (start<=end) {
        int mid=(start+end)/2;
        count++;
        if(a[mid]==num){
        
            
            
            fd=true;
            break;
            
        }
        else if(num<a[mid]){
            end=mid-1;
        
        }
        else if(num>a[mid]){
            start=mid+1;
            
        }
    
    }if(fd){
        System.out.println(count);
    }
    else{
        System.out.println("element not found");
    }



    }
}