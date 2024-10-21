package level4;

public class level4_2 {
    public static void main(String[] args){
        int[] num = new int[10];
        int temp;
        for(int i=0;i<10;i++){
            num[i] = (int)(Math.random()*1000) + 1;
        }

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
            System.out.print(num[i] + "\n");
        }
        System.out.println("时锐nb23物联网1班");
    }
}
