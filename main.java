import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n =sc.nextInt();
        int product =1;
        for(int i = 1; i <= n;  i ++){
            product = product * i; 
        }
        System.out.println( n + "! = " + product);
    }
}