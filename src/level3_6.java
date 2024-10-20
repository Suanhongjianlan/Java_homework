public class level3_6 {
    public static void PrintXing(int num){
        for(int i=0;i<(3-num);i++){
            System.out.print(" " + "\t");
        }
        for(int j=0;j<(2*num-1);j++){
            System.out.print("*" + "\t");
        }
        System.out.print("\n");
    }

    public static void PrintXingFan(int num){
        for(int i=0;i<(3-num);i++){
            System.out.print(" " + "\t");
        }
        for(int j=0;j<(2*num-1);j++){
            System.out.print("*" + "\t");
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        for (int k=1;k<=3;k++){
            PrintXing(k);
        }
        for (int k=2;k>=1;k--){
            PrintXing(k);
        }
        System.out.println("北京农学院时锐202020211111");
    }
}
