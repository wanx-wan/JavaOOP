package Abstract;
public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee("1","Name",10.0); //create objects
        e1.displayEmployee(); //Default constructor
        /* e1.setId("1");
        e1.setName("Name");
        e1.setSalary(10.0);
        e1.displayEmployee(); //printค่าทั้งหมด

        System.out.println(e1.getName()); */ //printเฉพาะค่าที่ต้องการ

        System.out.println(Employee.minSalary);
        System.out.println(Company.NAME);
        Company.job();

        Job p1 = new Job("1","Name",101.0);
        p1.displayEmployee();

        p1.bonus();
    }
}