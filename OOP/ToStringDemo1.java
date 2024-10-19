class Employee {
    int empid;
    String empname;
    double salary;

    Employee(int empid, String empname, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }

    public String toString() {
        return "Employee Id= " + this.empid + "\nEmployee Name= " + this.empname + "\nSalary = " + this.salary + "\n";
    }
}

public class ToStringDemo1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(26, "Manju", 50000);
        Employee e2 = new Employee(11, "Jack", 45000);
        Employee e3 = new Employee(24, "Likhith", 52000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}