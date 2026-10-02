package kt1;

public class Employee {

    private String name;
    private String position;
    private double salary;

    private static int employeeCount = 0;

//    конструктор
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;

        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }

        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }
// премия
    public double calculateBonus() {
        return salary * 0.1;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public String toString() {
        return name + " — " + position + ", оклад "
                + String.format("%.0f", salary);
    }
}