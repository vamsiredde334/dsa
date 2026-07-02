

import java.util.Scanner;
public class linearsearch{
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
            System.out.println("index of "+num+" is "+i);
            break;
        }
        
    }if(!find){
            System.out.println("please check number you entered");
        }
}
}
