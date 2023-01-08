public class Employee {
    private final int id;
    private String fullName;
    private int departamentId;
    private int salary;
    private static int idCounter = 1;

    public Employee(String fullName, int departamentId, int salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.departamentId = departamentId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartamentId() {
        return departamentId;
    }

    public int getSalary() {
        return salary;
    }

    public void setFullName() {
        this.fullName = fullName;
    }

    public void setDepartamentId() {
        this.departamentId = departamentId;
    }

    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id = " + getId() + "ФИО сотрудника: " + getFullName() + ", отдел сотрудника: " + getDepartamentId() + ", зарплата сотрудника: " + getSalary();
    }
}
