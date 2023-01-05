public class Coursework {
    public static final Employee[] emploees = new Employee[]{
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
        for (Employee employee : emploees) {
        }
    }

    public static int calculateFinalSalary() {
        int sum = 0;
        for (Employee employee : emploees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = emploees[0];
        int minSalary = emploees[0].getSalary();
        for (Employee employee : emploees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = emploees[0];
        int maxSalary = emploees[0].getSalary();
        for (Employee employee : emploees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        return calculateFinalSalary() / (float) 10;
    }

    public static void printFullName() {
        for (Employee employee : emploees) {
            System.out.println(employee.getFullName());
        }
    }
}
