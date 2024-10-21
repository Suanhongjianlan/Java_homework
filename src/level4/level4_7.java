package level4;

import java.util.Scanner;

public class level4_7 {
    public static void main(String[] args){
        System.out.println("请输入1个正整数：");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        System.out.println("这是一个" + num.length() + "位数");
        for(int i=num.length()-1;i>=0;i--){
            System.out.print(num.charAt(i));
        }
        System.out.println(" ");
        System.out.println("202020211111时锐nb");
    }
}
