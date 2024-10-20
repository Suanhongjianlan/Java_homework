
public class level3_2 {
    public static int jiecheng(int num){
        int max = 0;
        for(int i = 0;i<=num;i++){
            max += i;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("物联网1时锐202020211111");
        for(int i=0;i<=10;i++){
            System.out.println(jiecheng(i));
        }
    }
}
