package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student(); //변수생성 -> 객체생성 과정
        System.out.println("student1 = " + student1);
        student1.name = "학생1";
        student1.age = 19;
        student1.grade = 90;

        Student student2 = new Student();
        System.out.println("student2 = " + student2);
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();


        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성 적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성 적:" + student2.grade);
    }
}
