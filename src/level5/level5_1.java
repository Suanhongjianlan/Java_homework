package level5;
//设计一个学生类，描述学生的学号、姓名、语数外三门成绩。学号用整型，
//姓名用字符串类型，成绩用浮点型。编写一个测试类，输出该学生的单科成绩和总成绩。

class Student{
    public int id;
    public String name;
    public double mathScore;
    public double chineseScore;
    public double englishScore;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMathScore(double score){
        this.mathScore = score;
    }
    public void setEnglishScore(double score){
        this.englishScore = score;
    }
    public void setChineseScore(double score){
        this.chineseScore = score;
    }
    public void setScore(double mathScore,double chineseScore,double englishScore){
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
        this.englishScore = englishScore;
    }
}

class Test{
    public void OutScore(NewStudent student){
        System.out.println(student.mathScore);
        System.out.println(student.chineseScore);
        System.out.println(student.englishScore);
    }
    public void OutName(NewStudent student){
        System.out.println(student.name);
    }
    public void OutID(NewStudent student){
        System.out.println(student.id);
    }

}

public class level5_1 {
    public static void main(String[] args){
        NewStudent student1 = new NewStudent();
        student1.setScore(66.5,75.5,99.5);
        student1.setName("时锐");
        student1.setId(11);
        Test test = new Test();
        test.OutScore(student1);
        test.OutName(student1);
        test.OutID(student1);
    }

}
