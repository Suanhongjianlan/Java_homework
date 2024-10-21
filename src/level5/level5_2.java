package level5;

class NewStudent {
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
    public void isPassMath(){
        if(mathScore>=60){
            System.out.println("数学及格了！");
        }
        else{
            System.out.println("数学没及格。");
        }
    }
    public void isPassEnglish(){
        if(englishScore>=60){
            System.out.println("英语及格了！");
        }
        else{
            System.out.println("英语没及格。");
        }
    }
    public void isPassChinese(){
        if(chineseScore>=60){
            System.out.println("语文及格了！");
        }
        else{
            System.out.println("语文没及格。");
        }
    }
    public void printInfo(){
        isPassChinese();
        isPassEnglish();
        isPassMath();
    }
}

public class level5_2 {
    public static void main(String[] args){
        NewStudent student = new NewStudent();
        student.setName("时锐");
        student.setScore(100,99,20);
        student.printInfo();
    }
}
