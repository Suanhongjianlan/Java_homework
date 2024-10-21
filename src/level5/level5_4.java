package level5;

class Table {
    double longth;
    double with;
    double high;
    String color;

    public Table(double longth, double with, double high){
        this.longth = longth;
        this.with = with;
        this.high = high;
        this.color = "Yellow";
    }

    public Table(double longth, double with, double high, String color){
        this.longth = longth;
        this.with = with;
        this.high = high;
        this.color = color;
    }

    public Table(String color){
        this.longth = 10.0;
        this.with = 10.0;
        this.high = 10.0;
        this.color = color;

    }

    public void printInfo(){
        System.out.println("桌子长：" + this.longth + "厘米");
        System.out.println("桌子宽：" + this.with + "厘米");
        System.out.println("桌子高：" + this.high + "厘米");
        System.out.println("桌子颜色：" + this.color);
    }
}

public class level5_4 {
    public static void main(String[] args){
        Table table1 = new Table(44.5,55.5,66.6);
        table1.printInfo();
        Table table2 = new Table(99.9,88.8,77.7,"Blue");
        table2.printInfo();
        Table table3 = new Table("Rad");
        table3.printInfo();
        System.out.println("时锐NB202020211111");
    }
}
