import java.util.Scanner;
public class recursion {
   
    static void print(int a){
    if(a==0){
        return ;
    }
    System.out.println(a);
    print(a-1);

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        print(n);
    }
}
