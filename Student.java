public class Student {
    private String rollNo;
    private String name;
    private int age;
    private String department;

    public Student(String rollNo, String name, int age, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return rollNo + "," + name + "," + age + "," + department;
    }
}
