public class level3_3 {
        public static boolean IsSushu(int num){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            System.out.println("物联网1时锐202020211111");
            int j = 1;
            for(int i=1;i<=1000;i++){
                if(IsSushu(i)){
                    if(j%8==0){
                        System.out.println(i + "\t");
                    }
                    else {
                        System.out.print(i + "\t");
                    }
                    j++;
                }
            }
        }
}
