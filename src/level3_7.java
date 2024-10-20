public class level3_7 {
    public static void PrintNum(int num){
        for(int k=1;k<=num;k++){
            for(int i=0;i<(num-k);i++){
                System.out.print(" " + "\t");
            }
            for(int j=1;j<=k;j++){
                System.out.print(j + "\t");
            }
            for(int l=k;l>1;l--){
                System.out.print((l-1) + "\t");
            }
            System.out.print("\n");

        }

    }
    public static void main(String[] args){
        PrintNum(5);
        System.out.println("时锐20202021111123物联网1班");
    }
}
