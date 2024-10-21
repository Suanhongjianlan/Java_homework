package level2;

//计算半径为 4 的圆的面积，计算公式为：面积=半径*半径*3.14。
public class level2_1 {
    public static double circle_area(double r){
        return r * r * 3.14;
    }
    public static void main(String[] args) {
        System.out.println(circle_area(4));
    }
}
