public class Student-Mangement{
    private String name;
    private String Id;
    private String department;
    private float cgpa;

    // Constructor

    public  Student(){

    }
    public Student(String name, String Id, String department, float cgpa){

        this.name = name;
        this.Id = Id;
        this.department = department;
        this.cgpa = cgpa;
    }
    public  void setName(String name)
    {
        this.name = name;

    }
    public void setId(String Id){
        this.Id = Id;

    }
    public  void  setDepartment(String department){
        this.department = department;
    }
    public  void SetCgpa(float cgpa){
        this.cgpa = cgpa;
    }

    public String getName()
    {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getDepartment() {
        return department;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void showInfo(){
        System.out.println("Student Name:" + name);
        System.out.println("Student Id:" + Id);
        System.out.println("Student Department:" + department);
        System.out.println("Student Cgpa" + cgpa);

    }

}