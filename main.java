import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive Integer Number");
        int check;
        int n =sc.nextInt();
        long product =1;
        for(int i = 1; i <= n;  i ++){
            product = product * i; 
        }
        if(n>0){
        System.out.println( n + "! = " + product);
        }
        else{
            System.out.println("No Factorial for Negative Number");
        }
    }
}