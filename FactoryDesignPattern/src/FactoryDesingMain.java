package src;

public class FactoryDesingMain {

    public static void main(String[] args) {
        System.out.println("Employee is running...");
        EmployeeFactory factory = new EmployeeFactory();
        Employee employee = factory.createEmployee("Software");
        System.out.println("Software Emp created successfully with hash code :" + employee.toString() + "and his salary is " + employee.salary());

        Employee employee1 = factory.createEmployee("Hr");
        System.out.println("Hr Emp created successfully with hash code :" + employee1.toString() + "and his salary is " + employee1.salary());

        Employee employee2 = factory.createEmployee("Admin");
        System.out.println("Software Emp created successfully with hash code :" + employee2.toString() + "and his salary is " + employee2.salary());

    }
}