/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class TestNumberFrom1toN {
    public static void main(String[] args){
        NumberFrom1toN(4);
    }

    public static void NumberFrom1toN(int n){
        if (n==1){
            System.out.println(1);
        }
        else {
            NumberFrom1toN(n-1);
            System.out.println(n);
        }
    }
}
