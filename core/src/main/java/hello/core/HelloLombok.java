package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {

        HelloLombok h1 = new HelloLombok();
        h1.setAge(45);
        h1.setName("dfsfe");

        int age1 = h1.getAge();
    }
}
