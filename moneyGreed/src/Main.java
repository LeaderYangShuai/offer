import java.util.Scanner;

/**
 * 给定一个面比种类，比如是10 ，5 ， 1 找，然后给出一个num元
 * 兑换到的面比数量最少
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            min(num);
        }
    }
    public static void min(int num ){
        int n10=0,n5=0,n1=0;
        if (num>=10){
            n10=num/10;
            num = num%10;
        }
        if (num>=5){
            n5=num/5;
            num = num%5;
        }
        if (num<5){
            n1=num/1;
            num = num%1;
        }
        System.out.println(n10+"    "+n5+"    "+n1);
    }
}
