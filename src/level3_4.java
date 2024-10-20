//99乘法表
public class level3_4 {
    public static void PrintOneHang(int num){
        for (int i=1;i<=num;i++){
            System.out.print(num + "x" + i + "=" + num*i + "\t");
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        for(int j=1;j<=9;j++){
            PrintOneHang(j);
        }
        System.out.println("23物联网1时锐的99乘法表");
    }
}
