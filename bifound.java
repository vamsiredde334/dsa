import java.util.Scanner;
public class bifound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the search");
        int search=sc.nextInt();
        int start=0;
        int end=a.length-1;
        boolean find=false;
        while (start<=end) {
            int mid=(start+end)/2;
            if(a[mid]==search){
            find=true;
            }
            else if(a[mid]<search){
                end=mid-1;
                            }
            else {
                start=mid+1;

            }
                        }  

        if(find){
            System.out.println("element is found");

        }
        else{
            System.out.println("element not found");
        }
    }
}
