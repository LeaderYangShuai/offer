public class Ugly {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(10));
    }
        public static int GetUglyNumber_Solution(int index) {
            if (index <= 0){
                return 0;
            }
            int number = 0;
            int uglyCount = 0;
            while (uglyCount < index){
                number++;
                if(judgeUgly(number)){
                    uglyCount++;
                }
            }
            return number;
        }
        public static  boolean judgeUgly(int num){
            while(num%2==0){
                num = num/2;
            }
            while(num%3==0){
                num = num/3;
            }
            while(num%5==0){
                num=num/5;
            }
            if(num==1)return true;
            return false;
        }
}
