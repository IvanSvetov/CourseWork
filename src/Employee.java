public class Employee {


    String employeeName;
    int department;
    int salary;
    static int id;

    public Employee(String employeeName, int department, int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {

        return employeeName;
    }
    public int getDepartment() {

        return department;
    }
    public int getSalary() {

        return salary;
    }

    public void setDepartment(int department) {

        this.department = department;
    }
    public void setEmployeeSalary(int salary) {

        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ФИО: " + this.employeeName + ". Отдел: " + this.department + ". Зарплата: " +this.salary;
    }

}
