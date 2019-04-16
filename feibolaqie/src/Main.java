import java.util.HashMap;
import java.util.Scanner;

/**
 * 递归有终止条件
 */

public class Main {
    static int count [];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        count  = new int [num];
        for(int i = 0;i<count.length;i++){
            count[i]=-1;
        }
        System.out.println(fib(num));
    }
    public  static int fib(int num){
        if (num==2){
            return 2;
        }
        if (num==1){
            return 1;
        }

        if (count[num-1]==-1){
            count[num-1] =fib(num-1)+fib(num-2);
        }
         return count[num-1];
    }
}
