import java.sql.SQLOutput;

public class Main {


        public static void main(String[] args) {

            Employee[] employees = new Employee[10];


            employees[0] = new Employee("Иванов Иван Иванович", 1,48000);
            employees[1] = new Employee("Петров Сергей Васильевич", 2,51000);
            employees[2] = new Employee("Котов Андрей иванович", 1,38000);
            employees[3] = new Employee("Медведь Василий Сергеевич", 3,43000);
            employees[4] = new Employee("Алексеев Сергей константинович", 4,41000);
            employees[5] = new Employee("Бумажник Петр Иванович", 5,55000);
            employees[6] = new Employee("Молоко Игорь Геннадьевич", 1,52000);
            employees[7] = new Employee("Яснов Роман Петрович", 2,54000);
            employees[8] = new Employee("Луков Александр Васильевич", 3,47000);
            employees[9] = new Employee("Панов Михаил Григорьевич", 4,49000);



            //общая информация
            System.out.println("Информация о всех сотрудниках:");
            printAll(employees);
            System.out.println();

            //сумма затрат на ЗП в месяц
            salarySum(employees);
            System.out.println();

            //сотрудник с минимальной зарплатой
            minSalary(employees);
            System.out.println();

            //сотрудник с максимальной зарплатой
            maxSalary(employees);
            System.out.println();

            //средняя зарплата сотрудников
            averageSalary(employees);
            System.out.println();

            System.out.println("Имена всех сотрудников: ");
            namesOfEmployers(employees);



    }
    public static void printAll(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
     public static int salarySum(Employee[] employees) {

            int salarySum = 0;
            for (int i = 0; i < employees.length; i++) {
             salarySum = salarySum + employees[i].getSalary();

         }
         System.out.println("Сумма затрат на зарплаты в месяц составляет: " + salarySum);
            return salarySum;
     }

     public static void minSalary(Employee[] employees) {
         int minSalary = 60000;
         String minEmployer = null;
         for (int i = 0; i < employees.length; i++) {
             if (employees[i].getSalary() < minSalary) {
                 minSalary = employees[i].getSalary();
                 minEmployer = employees[i].getName();
             }
         }
         System.out.println("Сотрудник с минимальной зарплатой : " + minEmployer + " " + minSalary);

     }
     public static void maxSalary(Employee[] employees) {
            int maxSalary = 0;
            String maxEmployer = null;
         for (int i = 0; i < employees.length; i++) {
             if (employees[i].getSalary() > maxSalary) {
                 maxSalary = employees[i].getSalary();
                 maxEmployer = employees[i].getName();
             }
         }
         System.out.println("Сотрудник с максимальной зарплатой: " + maxEmployer + " " + maxSalary);
     }
     public static void averageSalary(Employee[] employees) {
            int average = 0;
            if (employees.length > 0) {
                int sum = 0;
                for (int i = 0; i < employees.length; i++) {
                    sum += employees[i].getSalary();
                }
                average = sum / employees.length;
            }

         System.out.println("Среднее значение зарплат: " + average);
     }
     public static void namesOfEmployers(Employee[] employees) {
         for (int i = 0; i < employees.length; i++) {
             System.out.println(employees[i].getName());
         }
     }
}
