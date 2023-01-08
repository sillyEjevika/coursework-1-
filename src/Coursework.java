public class Coursework {
    public static final Employee[] EMPLOYEES = {
            new Employee("Наумов Гавриил Евсеевич", 1, 1500),
            new Employee("Голубев Ким Романович", 3, 2200),
            new Employee("Соболев Прохор Леонидович", 5, 3000),
            new Employee("Григорьев Митрофан Германнович", 1, 2150),
            new Employee("Князев Оскар Борисович", 2, 2230),
            new Employee("Фомичёв Денис Тимофеевич", 3, 5500),
            new Employee("Симонов Мечислав Эдуардович", 4, 1600),
            new Employee("Никифоров Богдан Иванович", 4, 6600),
            new Employee("Соловьёв Емельян Феликсович", 2, 4650),
            new Employee("Захаров Зиновий Феликсович", 5, 5780),
    };

    public static void printEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    public static int calculateFinalSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = EMPLOYEES[0];
        int minSalary = Integer.MIN_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = EMPLOYEES[0];
        int maxSalary = Integer.MAX_VALUE;
        for (Employee employee : EMPLOYEES) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateFinalSalary() / (float) EMPLOYEES.length;
    }

    public static void printFullName() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }
}

