//设计一个描述二维平面上点的类Position，
// 该类需要封装描述点的横坐标和纵坐标，
// 并提供访问器方法（set方法和get方法），
// 最后打印输出两点间的距离。

package level6;

import java.util.Scanner;

class Position{
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }
}

public class level6_3 {
    public static double getDistance(Position a,Position b){
        double d;
        d = Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2));
        return d;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Position position1 = new Position();
        System.out.println("请输入点A的横坐标（x）值：");
        position1.setX(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("请输入点A的纵坐标（y）值：");
        position1.setY(scanner.nextDouble());
        scanner.nextLine();
        Position position2 = new Position();
        System.out.println("请输入点B的横坐标（x）值：");
        position2.setX(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("请输入点A的纵坐标（y）值：");
        position2.setY(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("AB之间的距离是：");
        System.out.println(getDistance(position1,position2));
    }
}
