package employeesystem;

public class Staff{
    public static void main(String []args ){
        Employee teachingStaff1 = new Employee();
        Employee nonTeachingStaff1 = new Employee();
        Employee technicianStaff1 = new Employee();
        technicianStaff1.firstName = "Jones";
        technicianStaff1.role = "paperchasing";
        System.out.println(technicianStaff1.firstName + technicianStaff1.role);

    }

}
class Employee{

    
    String firstName;
    String secondName;
    int idNo;
    int yearOfBirth;
    String dept;
    String role;
    int salary;

    //methods
    public void changedept(String newdept){
        this.dept = newdept;
    }
    public void changerole(String newrole){
        this.role = newrole;
    }
    public void changesalary(int newsalary){
        this.salary = newsalary;
    }


}