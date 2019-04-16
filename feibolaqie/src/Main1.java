import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main1{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        solution(num);
    }
    public static void solution(int num){
        //三个栈
        Stack A = new Stack();
        Stack B = new Stack();
        Stack C = new Stack();
        for (int i = num ;i>0;i--){
            A.push(i);
        }
        int num1 = (int)A.pop();
        C.push(num1);
        System.out.println("a-"+num1+"-c");
        int num2 = (int)A.pop();
        B.push(num2);
        System.out.println("a-"+num2+"-b");
        while((!A.empty())&& (int)C.peek()==1){
            int temB = (int)B.peek();
            int temC = (int)C.peek();
            if(temB>temC){
                int num3 =(int)C.pop();
                B.push(num3);
                System.out.println("c-"+num3+"-b");
                int num4 = (int)A.pop();
                C.push(num4);

                System.out.println("a-"+num4+"-c");
            }
        }
    }
}