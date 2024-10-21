package level5;

class Book{
    String author;
    String bookName;
    String pub;
    double price;

    public Book(){
        this.author = "作者";
        this.bookName = "书名";
        this.pub = "出版社";
        this.price = 20.0;
    }

    public Book(String author,String bookName,String pub,double price){
        this.author = author;
        this.bookName = bookName;
        this.pub = pub;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("本书的作者是：" + author);
        System.out.println("本书的书名是：" + bookName);
        System.out.println("本书的出版社是：" + pub);
        System.out.println("本书的价格是：" + price);
    }
}

public class level5_5 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.printInfo();
        Book book2 = new Book("时锐","《论时锐为什么这么帅》","北京大学出版社",99.9);
        book2.printInfo();
    }
}
