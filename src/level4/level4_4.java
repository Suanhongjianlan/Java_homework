package level4;

import java.util.Scanner;

public class level4_4 {
    public static void main(String[] args){
        System.out.println("请输入10个正整数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(isPalindrome(num)){
            System.out.println("是回数");
        }
        else{
            System.out.println("不是回数");
        }
        System.out.println("202020211111时锐");

    }

    public static boolean isPalindrome(int number) {
        // 将整数转为字符串
        String str = String.valueOf(number);
        int left = 0;
        int right = str.length() - 1;

        // 使用双指针比较
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // 不是回文数
            }
            left++;
            right--;
        }
        return true; // 是回文数
    }

}
