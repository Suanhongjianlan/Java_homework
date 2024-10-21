package level5;

// 定义复数类
class ComplexNumber {
    public double realPart; // 实部
    public double imagePart; // 虚部

    // 无参构造方法
    public ComplexNumber() {
        this.realPart = 0;
        this.imagePart = 0;
    }

    // 带两个参数的构造方法
    public ComplexNumber(double real, double image) {
        this.realPart = real;
        this.imagePart = image;
    }

    // 复数加法方法
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.realPart + other.realPart, this.imagePart + other.imagePart);
    }

    // 打印复数的方法
    public void print() {
        System.out.println(realPart + " + " + imagePart + "i");
    }
}

public class level5_6 {
    public static void main(String[] args){
        ComplexNumber first = new ComplexNumber();
        first.realPart = 1;
        first.imagePart = 2;
        ComplexNumber second = new ComplexNumber(3,4);

        ComplexNumber addr = new ComplexNumber();
        addr.realPart = first.realPart + second.realPart;
        addr.imagePart = first.imagePart + second.imagePart;

        addr.add(addr);
        addr.print();
    }
}
