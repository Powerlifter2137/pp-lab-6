import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Kazik", 1900, 1);
        Worker worker2 = new Worker("Adi", 3800, 2);
        Worker worker3 = new Worker("Tomek", 2900, 3);
        Worker worker4 = new Worker("Pawel", 2500, 4);

        Manager manager = new Manager("Grzegorz", 6000, 5);

        System.out.println("worker1 salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("worker2 salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("worker3 salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("worker4 salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("manager salary: " + manager.getSalary());
        manager.work();
    }
}