import kt1.Employee;
import kt1.Manager;

public class Main {

    // Общий бюджет на премии
    public static double totalBonusBudget(Employee[] staff) {
        double total = 0;

        for (Employee item : staff) {
            total += item.calculateBonus();
        }

        return total;
    }

    public static void main(String[] args) {

        // Полиморфный массив
        Employee[] staff = {
                new Employee("петров", "разработчик", 90000),
                new Employee("кузнецов", "тестировщик", 70000),
                new Manager("сидоренко", "руководитель", 120000, 5),
                new Manager("иванов", "менеджер", 100000, 3)
        };

        System.out.println("сотрудники и премии");
        for (Employee item : staff) {
            System.out.println(item);
            System.out.println("премия: " + item.calculateBonus());
            System.out.println();
        }

        // Часть Д. Подсчёт менеджеров
        int managerCount = 0;

        System.out.println("менеджеры");

        for (Employee item : staff) {

            if (item instanceof Manager) {
                managerCount++;

                Manager manager = (Manager) item;

                System.out.println(
                        manager.getName()
                                + " — размер команды: "
                                + manager.getTeamSize()
                );
            }
        }

        System.out.println("количество менеджеров: " + managerCount);

        // Часть Е. Общий бюджет на премии
        double totalBonus = totalBonusBudget(staff);

        System.out.println();
        System.out.println(" общий бюджет на премии");
        System.out.println("всего: " + totalBonus);

        // Static-счётчик сотрудников
        System.out.println();
        System.out.println("всего создано сотрудников: "
                + Employee.getEmployeeCount());
    }
}
