import java.util.Scanner;

public class level4_1 {
    public static void main(String[] args){
        int[] num = new int[10];
        System.out.println("请输入10个正整数：");
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++){
            num[i]=scanner.nextInt();
        }
        int temp;
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(num[i]>num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(num[i] + "\t");
        }
        System.out.println("时锐nb23物联网1班");
    }
}
