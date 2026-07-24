import java.util.Scanner;
import java.util.ArrayList;
public class meargesort {
    static void mearge(int[] arr,int low ,int mid, int high){
    ArrayList<Integer> temp=new ArrayList<>();
    int i=low;
    int j=mid+1;
    while (i<=mid&&j<=high) {
    if(arr[j]<=arr[i]){
        temp.add(arr[j]);
        j++;
    }
    else{
        temp.add(arr[i]);
        i++;
    }
    while (i<=mid) {
        temp.add(arr[i]);
        i++;
    }
    for(int k=low; k<=high; k++){
        arr[k]=temp.get(k-low);
    }
    }
    }
    static void meargeSort(int[] arr,int low , int high){
    if(low>=high){
        return;
    }
    int mid=(low+high)/2;
    meargeSort(arr,low,mid);
    meargeSort(arr, mid+1, high);
    mearge(arr, low, mid, high);
    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
        }
        meargeSort(arr, 0, n - 1);
        for(int i = 0; i < n; i++){
        System.out.print(arr[i] + " ");
        }
    }
}
