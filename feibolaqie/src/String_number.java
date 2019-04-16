import java.util.Scanner;

public class String_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String string = scanner.next();
            str_number(string);
        }
    }
    public static void str_number(String s){
        char [] ch = s.toCharArray();
        for (char c:ch){
            System.out.println((int)c);
        }
    }
}
