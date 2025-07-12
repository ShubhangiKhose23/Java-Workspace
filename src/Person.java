import java.util.Scanner;

final class Person {
    private final String name;
    private final int age;

    public Person() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        sc.close();
    }

    public String setName() {
        return name;
    }

    public int setAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Name: " + p.setName());
        System.out.println("Age: " + p.setAge());
    }
}
