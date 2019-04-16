import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 实现字符串的倒序
 */
public class String_reverse {
    public static void main(String[] args) {
        reverse("asdfgh");
        System.out.println();
        System.out.println(sub("1111aabcaad"));
    }
    public static  void reverse(String str){
        char [] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]+"\t");
        }
    }

    //实现字符串的去重复
    static String sub(String str){
        StringBuffer result = new StringBuffer();
        List list = new ArrayList();
        char[] cs = str.toCharArray();
        for(int i=0; i<cs.length; i++){
            if(!list.contains(cs[i])){
                result.append(cs[i]);
                list.add(cs[i]);
            }
        }
        return result.toString();
    }

    //丑数的算法

    int isUgly(int number){ //判断number是否是丑数
        while(number%2==0){ //判断数能否被2整除
            number=number/2;
        }

        while(number%3==0){ //判断数能否被3整除
            number=number/3;
        }

        while(number%5==0){ //判断数能否被5整除
            number=number/5;
        }

        if(number == 1) //
            return 1;
        else
            return 0;
    }

    //求解水仙花数

    /**
     * “水仙花数”是一个三位数其各位数字的立方和等于该数本身。例如：3^3 + 7^3+ 0^3 = 370
     */
    public boolean water_flower(int num){
        boolean bool = false;
        if(num<100 || num >999)return bool;
        int a = num/100;
        num = num%100;
        int b = num/10;
        num = num%10;
        int c = num;
        if(a*a*a+b*b*b+c*c*c==num)bool=true;

        return bool;
    }
    //零钱有多少种找法,10快，5快，2快
    public int HowMoney(int num){
        int count=0;
        for(int a = 0 ;a<=num/10;a++){
            for (int b = 0;b<=num/5;b++){
                for(int c = 0;c<=num/2;c++){
                    if(10*a+5*b+2*c==num){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    //找零钱的最优解
    public void money_best(int num){
        int n10=0,n5=0,n1=0;
        if(num>=10){
            n10 = num/10;
            num = num%10;
        }
        if (num>=5){
            n5 = num/5;
            num = num%5;
        }
        if (num<5){
            n1 = num;
        }
        System.out.println("10元"+n10+"\t"+"5元"+n5+"\t"+"1元"+n1);
    }

    //求几个数的连续三个数的和最大
    public long max_three(long [] arr){
        int n = arr.length;
        Arrays.sort(arr);
        long max1 = arr[0]*arr[1]*arr[n-1];
        long max2 = arr[n-1]*arr[n-2]*arr[n-3];
        return (max1>max2)? max1:max2;
    }
    //求解不用第三个值如何交换两个数
    public void swap(int x,int y){
         x = x+y;
         y=x-y;
         x=x-y;
    }

}
