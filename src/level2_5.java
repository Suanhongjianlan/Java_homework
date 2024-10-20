import java.util.Scanner;

//输入一个自然数，判断其是否为求水仙花数。水仙花数是指个位、十位和百位三个数的立方和等于这个三位数本身的数。
public class level2_5 {
    public static int flower(int num){
        int res;
        res = ((num/100) * (num/100) * (num/100)) + (((num%100)/10) * ((num%100)/10) * ((num%100)/10)) + (((num%100)%10) * ((num%100)%10) * ((num%100)%10));
        return res;
    }
    public static void main(String[] args) {
        int i;
        while (true) {
            System.out.println("请输入一个0-999之间的自然数");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                i = scanner.nextInt();
                if (i >= 0 && i<= 999) {
                    break;
                } else {
                    System.out.println("你输入了个锤子");
                }
            } else {
                System.out.println("你输入了个锤子");
            }
        }
        System.out.println("计算结果为：");
        System.out.println(flower(i));
        if(flower(i) == i){
            System.out.println("这是水仙花数");//153、370、371、407
        }
        else{
            System.out.println("这不是水仙花");
        }
    }
}



//天才
//import java.util.Scanner;
//public class level2_5 {
//    public static void main(String[] arg){
//        int i;
//        System.out.println("请输入一个0-999的自然数");
//        while (true){
//            Scanner scanner = new Scanner(System.in);
//            if (scanner.hasNextInt()) {
//                i = scanner.nextInt();
//                if (i >= 0 && i<= 999) {
//                    break;
//                } else {
//                    System.out.println("你输入了个锤子");
//                }
//            } else {
//                System.out.println("你输入了个锤子");
//            }
//        }
//        if(i == 153 || i == 370 || i == 371 || i ==407){
//            System.out.println("是水仙花数");
//        }
//        else{
//            System.out.println("不是");
//        }
//    }
//}