package level2;//输入一个正整数，判断其是否被3，5，7同时整除。

import java.util.Scanner;

public class level2_4 {
    public static void main(String[] args){
        int i;
        while (true){
            System.out.println("请输入一个正整数");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()){
                i = scanner.nextInt();
                if(i>0){
                    break;
                }
                else{
                    System.out.println("你输入了个锤子");
                }
            }
            else{
                System.out.println("你输入了个锤子");
            }
        }
        //System.out.println("这个数能否被3、5、7同时整除：");
        if(i%3 == 0 && i%5 == 0 && i%7 ==0){    //3*5*7 105
            System.out.println("这个数可以被3、5、7同时整除");
        }
        else{
            System.out.println("这个数不能被3、5、7同时整除");
        }


    }
}
