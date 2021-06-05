package Abstract;
public class Employee {
    // Attribute
    private String id;
    private String name;
    private double salary;


    //Static attributes
    static int minSalary = 120;

    //Defult Constructor
    public Employee(String id, String name, double salary){
        /*this.id = "2";
        this.name = "Name";
        this.salary = 101.0;*/

        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    //method
    public void setId(String id) {
        this.id =id;

    }
    public void setName(String name) {
        this.name = name;

    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //printค่าทั้งหมด
    public void displayEmployee() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }

    //printเฉพาะค่าที่ต้องการ
    public String getName() {
        return this.name;
    }

    public  void bonus(){

    }
}
