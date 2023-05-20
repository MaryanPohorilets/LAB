public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person() {
        this.fullName = fullName;
        this.age = age;
    }

    void move(){
        System.out.printf("%s рухається \n", fullName);
    }
    void talk(){
        System.out.printf("%s говорить \n", fullName);
    }
}
