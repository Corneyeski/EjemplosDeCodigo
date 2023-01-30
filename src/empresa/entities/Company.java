package empresa.entities;


public class Company {
    private static Company company = null;
    public int managersCount;
    public int workersCount;
    public Employee[] employees;

    private Company() {
        managersCount = 0;
        workersCount = 0;
        employees = new Employee[10];
    }

    public static Company getInstance() {
        // To ensure only one instance is created
        if (company == null) {
            company = new Company();
        }
        return company;
    }



}
