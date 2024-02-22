package Construct.ex;

public class Book {
    String title; // 제목
    String author; // 저자
    int page; //페이지 수

    //코드 완성
    Book() {
        //클래스의 생성자 코드에 중복이 없도록 주의
        this("","",0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    Book(String title, String author) {
        //클래스의 생성자 코드에 중복이 없도록 주의
        this(title,author,0);
    }

    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
