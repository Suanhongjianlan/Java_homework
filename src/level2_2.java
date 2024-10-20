//将华氏温度 64 度转换为摄氏温度，转换成的摄氏温度在屏幕上显示出来：转换公式为：摄氏度=(5/9)*(华氏度-32)
public class level2_2 {
    public static double FCtransforme(double F){
        return (F-32) * ((double) 5 /9);
    }
    public static void main(String[] args) {
        System.out.println(FCtransforme(64));
    }
}
