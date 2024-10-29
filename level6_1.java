//1、设计一个学生类，描述学生的姓名、年龄和计算机、英语、数学3门成绩。
// 要求所有属性必须封装且必须通过访问器方法调用，输出的所有信息不要在类中直接输出，
// 而是要在调用中输出，输出该学生的姓名、年龄及总分、平均分、最高分和最低分。

package level6;

class Students{
    private String name;
    private int age;
    private final double[] Score;

    public Students(){
        Score = new double[3];
    }

    public void setName(String n){
        this.name = n;
    }

    public void setScore(double[] score){
        this.Score[0]=score[0];
        this.Score[1]=score[1];
        this.Score[2]=score[2];
    }

    public void setAge(int a){
        this.age = a;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getScore(int i){
        if(i==0)return this.Score[0];
        else if(i==1)return this.Score[1];
        else if(i==2)return this.Score[2];
        else return 0.0;
    }
}



public class level6_1 {
    public static double GetMaxScore(double score1,double score2,double score3){
        if(score1>score2){
            return Math.max(score1, score3);
        }
        else {
            if(score2>score3)
                return score2;
            else return score1;
        }
    }

    public static double GetMinScore(double score1,double score2,double score3){
        if(score1>score2){
            return Math.min(score2, score3);
        }
        else {
            return Math.min(score1, score3);
        }
    }

    public static void main(String[] args){
        Students shirui = new Students();
        shirui.setName("时锐");
        shirui.setAge(22);
        double[] score = {100,99,98};
        shirui.setScore(score);
        System.out.println("学生姓名：" + shirui.getName());
        System.out.println("学生年龄：" + shirui.getAge());
        System.out.println(shirui.getName() + "的计算机成绩：" + shirui.getScore(0));
        System.out.println(shirui.getName() + "的英语成绩：" + shirui.getScore(1));
        System.out.println(shirui.getName() + "的数学成绩：" + shirui.getScore(2));
        System.out.println(shirui.getName() + "的总成绩：" + (shirui.getScore(0)+shirui.getScore(1)+ shirui.getScore(2)));
        System.out.println(shirui.getName() + "的平均成绩：" + ((shirui.getScore(0)+shirui.getScore(1)+ shirui.getScore(2))/3));
        System.out.println(shirui.getName() + "的最高成绩：" + GetMaxScore(shirui.getScore(0), shirui.getScore(1), shirui.getScore(2) ));
        System.out.println(shirui.getName() + "的最低成绩：" + GetMinScore(shirui.getScore(0), shirui.getScore(1), shirui.getScore(2) ));

    }
}
