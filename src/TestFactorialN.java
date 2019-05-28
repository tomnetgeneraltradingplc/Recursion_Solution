/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class TestFactorialN {
    public static void main(String[] args){
        System.out.println("Factorial of 5 is = " + factorial(5));
    }
    public static int factorial(int n){
        if (n==1) return 1;
        else {
            return n* factorial(n-1);
        }
    }
}
/*
Output
------------
Factorial of 5 is = 120
 */