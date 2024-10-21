package level3;

import java.util.Scanner;

public class level3_8 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner scanner = new Scanner(System.in);
        fun(scanner.nextInt());
        System.out.println("时锐202020211111");
    }

    public static void fun(int num){
        for(int i=1;i<=num;i++){
            int factor=0; //定义因子变量和，初始值0
            for(int j=1;j<i/2+1;j++){
                if(i%j==0)
                    factor+=j;
            }//内层循环结束；
            if(factor==i)
                System.out.println("  "+i);
        }//外层循环结束


    }
}
