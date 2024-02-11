package Construct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MemberInit {
    String name;
    int age;
    int grade;

    //this 는 자기자신의 인스턴스 참조를 가리켜
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
