/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class TestSumOfFirstNNumbers {
    public static void main(String[] args){
        System.out.println("Sum of First number for 5 is = " + sumOfFirstNNumber(5));
    }
    public static int sumOfFirstNNumber(int n){
        if (n==1) return 1;
        else {
            return n + sumOfFirstNNumber(n-1);
        }

    }
}
/*
Output
-----------
Sum of First number for 5 is = 15
 */