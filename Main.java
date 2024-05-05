import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Tomasz", 2000, 1, "2022-11-05", "Junior Developer");
        Worker worker2 = new Worker("Kazik", 2800, 2, "2022-05-16", "Senior Developer");
        Worker worker3 = new Worker("Pawel", 2900, 3, "2021-10-12", "Tester");
        Worker worker4 = new Worker("Alicja", 2100, 4, "2021-07-27", "Project Manager");

        Manager manager = new Manager("Gawel", 7000, 5, "2019-05-10", "Department Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}