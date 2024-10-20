//输入三个整数，求最大值和最小值。

import java.util.Scanner;

public class level2_3 {
    public static int max_get(int a,int b,int c){
        int r;
        if(a>b){
            r=a;
        }
        else{
            r=b;
        }
        if(r>c){
            return  r;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {

        int a,b,c;
        while (true){
            System.out.println("请输入第一个数：");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            }
            else{
                System.out.println("你输入了个锤子？");
            }
        }
        while (true){
            System.out.println("请输入第二个数：");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                b = scanner.nextInt();
                break;
            }
            else{
                System.out.println("你输入了个锤子？");
            }
        }
        while (true){
            System.out.println("请输入第三个数：");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                c = scanner.nextInt();
                break;
            }
            else{
                System.out.println("你输入了个锤子？");
            }
        }
        System.out.println("这三个数最大的是：");
        System.out.println(max_get(a,b,c));
    }
}
