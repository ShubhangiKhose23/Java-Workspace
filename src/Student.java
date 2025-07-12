
public class Student
{
    private String name;
    private int rno;
    private int marks;


    public Student(String name, int rno, int marks) {
        this.name = name;
        this.rno= rno;
        this.marks = marks;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getRno()
    {
        return rno;
    }
    public void setRno(int rno)
    {
        this.rno=rno;
    }

    public int getMarks()
    {
        return marks;
    }

    public void setMarks()
    {
        if (marks>=40 && marks<=100)
        {
            this.marks=marks;
        }
        else {
            System.out.println("Marks between 0 t 40");
        }
    }
    public boolean hasPassed() {
        return marks >= 40;
    }
    public static void main(String[] args)
    {
        Student s=new Student("Ram",1,45);
        Student s1=new Student("Sita",2,18);
        System.out.println("Student 1St Details:" );
        System.out.println( "name: "+s.getName()+",Rno: "+s.getRno()+",Marks: "+s.getMarks());
        if(s.hasPassed())
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
        System.out.println("Student 2nd Details:");
        System.out.println("name: "+s1.getName()+",Rno: "+s1.getRno()+",Marks: "+s1.getMarks());
        if(s1.hasPassed())
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }

}