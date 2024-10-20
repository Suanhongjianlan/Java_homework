import java.util.Scanner;

public class level3_9 {
    public static void Rabbit(int time){
        int bigRabbit = 0;
        int rabbit = 1;
        int temp =0;
        for(int i=0;i<time;i++){
            temp = bigRabbit;
            bigRabbit += rabbit;
            rabbit = 0;
            rabbit = temp;
        }
        System.out.println("大兔子有：" + bigRabbit + "只。");
        System.out.println("小兔子有：" + rabbit + "只。");
    }

    public static void main(String[] args){
        System.out.println("请输入时间（月）");
        Scanner scanner = new Scanner(System.in);
        Rabbit(scanner.nextInt());
        System.out.println("202020211111时锐");
    }
}
