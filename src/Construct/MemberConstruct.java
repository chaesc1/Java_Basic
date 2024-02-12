package Construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age) {
        this(name, age, 50); // 변경
    }

    MemberConstruct(String name, int age, int grade) { // 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다.
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
