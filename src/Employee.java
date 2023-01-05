public class Employee {
    private final Integer id;
    private String fullName;
    private Integer departamentId;
    private Integer salary;
    private static Integer idCounter = 1;

    public Employee(String fullName, Integer departamentId, Integer salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.departamentId = departamentId;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getDepartamentId() {
        return departamentId;
    }

    public Integer getSalary() {
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
        return "id = " + id + "ФИО сотрудника: " + fullName + ", отдел сотрудника: " + departamentId + ", зарплата сотрудника: " + salary;
    }
}
