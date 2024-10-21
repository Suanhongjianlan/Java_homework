package level5;

class ThirdStudent{
    String id;
    String name;
    char sex;
    int classes;
    private static int studentCount = 0;
    public ThirdStudent(String id,String name,char sex,int classes){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.classes = classes;
        studentCount++;
    }

    public void printStudentInfo(){
        System.out.println("打印学生信息：");
        System.out.println("学号：" + id);
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("班级：" + classes + "班");
    }
    public void printStudentNum(){
        System.out.println("一共有" + studentCount + "个学生。");
    }

}

public class level5_3 {
    public static void main(String[] args){
        ThirdStudent shirui = new ThirdStudent("11","时锐",'男',1);
        ThirdStudent xiaoming = new ThirdStudent("01","小明",'男',2);
        ThirdStudent xiaohong = new ThirdStudent("02","小红",'女',2);
        shirui.printStudentInfo();
        xiaohong.printStudentInfo();
        shirui.printStudentNum();

    }
}
