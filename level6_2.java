//2、把Student类封装起来，模拟一个转校生转入新学校后为其制作学生信息的过程。
//转校生李敖的学生信息如下：
//———————————————————————————————————————————————————————
//学号	 姓名	 性别	籍贯		        父母的联系方式
//———————————————————————————————————————————————————————
//26	 李敖 	 男	    北京市海淀区		父：13001101100
//					                 母：13611112222
//———————————————————————————————————————————————————————

package level6;

import java.util.Scanner;

class Student2{
    private String name;
    private int id;
    private String sex;
    private String origin;
    private String fatherPhoneNumber;
    private String matherPhoneNumber;

    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setOrigin(String o){
        this.origin = o;
    }
    public void setSex(String s){
        this.sex = s;
    }
    public void setFatherPhoneNumber(String n){
        this.fatherPhoneNumber = n;
    }
    public void setMatherPhoneNumber(String n){
        this.matherPhoneNumber = n;
    }

    public int getId(){
        return this.id;
    }
    public String getSex(){
        return this.sex;
    }
    public String getName(){
        return this.name;
    }
    public String getOrigin(){
        return this.origin;
    }
    public String getFatherPhoneNumber(){
        return this.fatherPhoneNumber;
    }
    public String getMatherPhoneNumber(){
        return this.matherPhoneNumber;
    }
}

public class level6_2 {
    public static void main(String[] args){
        Student2 student2 = new Student2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新学生的姓名：");
        student2.setName(scanner.nextLine());
        System.out.println();
        System.out.println("学生id：");
        student2.setId(scanner.nextInt());
        scanner.nextLine();//如果没有这一行将会跳过籍贯的输入
        System.out.println();
        System.out.println("输入学生的籍贯");
        student2.setOrigin(scanner.nextLine());
        System.out.println();
        System.out.println("请输入学生的性别");
        student2.setSex(scanner.nextLine());
        System.out.println();
        System.out.println("录入学生父亲联系方式：");
        student2.setFatherPhoneNumber(scanner.nextLine());
        System.out.println();
        System.out.println("录入学生母亲联系方式：");
        student2.setMatherPhoneNumber(scanner.nextLine());
        System.out.println();
        System.out.println("———————————————————————————————————————————————————————");
        System.out.println("学号\t姓名\t性别\t籍贯\t\t父母的联系方式");
        System.out.println("———————————————————————————————————————————————————————");
        System.out.print(student2.getId()+"\t");
        System.out.print(student2.getName()+"\t");
        System.out.print(student2.getSex()+"\t");
        System.out.print(student2.getOrigin()+"\t");
        System.out.print("\t父亲电话：" + student2.getFatherPhoneNumber()+"\n");
        System.out.println("\t\t\t\t\t母亲电话：" + student2.getMatherPhoneNumber()+"\t");
        System.out.println("———————————————————————————————————————————————————————");

    }
}
