import java.util.Scanner;
public class compound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the principal amount");
    double p=sc.nextDouble();
    System.out.println("enter the interest rate");
    double r=sc.nextDouble();
    System.out.println("enter the time");
    int t=sc.nextInt();
    System.out.println("enter the compounded ");
    int n=sc.nextInt();
    double ci = p*Math.pow((1+(r/n)),(n*t));
    System.out.println("compound interest is: " + ci);
    }
    }