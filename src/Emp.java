import java.util.Scanner;
public class Emp {

    public static void main (String[] args)
    {
    Scanner sc=new Scanner(System.in);
    ItDept d=new ItDept();
    d.id=1;
    d.name="Ram";
    d.code='R';
    d.getInfo();

    ManagmentDept m=new ManagmentDept();
    m.id=sc.nextInt();
    sc.nextLine();
    m.name=sc.nextLine();
    m.code=sc.next().charAt(0);
    String manInfo=m.getInfo();
    System.out.println(manInfo);
    }
}
class ItDept {
    int id;
    String name;
    char code;

    void getInfo() {
    System.out.println("Id : "+id+",name : "+name+",code : "+code);
    }
}
class ManagmentDept{
    int id;
    String name;
    char code;

    String getInfo() {
        return "Id : " + id + ", name : " + name + ", code : " + code;
    }
}
/*final class Person{
    private final String name;
    private final int age;
}*/
