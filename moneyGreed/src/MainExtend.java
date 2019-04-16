/**
 * 考虑仅用1分、5分、10分、25分和50分这5种硬币支付某一个给定的金额。例如需要支付11分钱，有一个1分和一个10分、一个1分和两个5分、六个1分和一个5分、十一个1分这4种方式。
 * 请写一个程序，计算一个给定的金额有几种支付方式。
 * 注：假定支付0元有1种方式。
 */

import java.util.Scanner;
public class MainExtend{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println(solution(num));
        }
    }
    public static int solution(int num){
        int count=0;
        for(int a = 0;a<=num/50;a++){
            for(int b = 0;b<=num/25;b++){
                for(int c = 0;c<=num/10;c++){
                    for(int d= 0;d<=num/5;d++){
                        for(int e = 0;e<=num;e++){
                            if (50*a+25*b+10*c+5*d+e==num){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}