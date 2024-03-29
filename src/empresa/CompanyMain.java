package empresa;

import empresa.entities.Employee;
import empresa.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static empresa.entities.Company.getInstance;
import static empresa.service.BossMenu.bossMenu;
import static empresa.service.ManagerMenu.managerMenu;
import static empresa.service.WorkerMenu.workerMenu;
import static empresa.utils.Constants.*;
import static empresa.utils.Utils.Types.*;

public class CompanyMain {

    public static void main(String... args) {
        //Initialize data
        getInstance().employees[0] = new Employee(0, "10203040T", "Boss", "admin", Employee.Rank.BOSS);
        int option = 0;

        Employee employee = new Employee();
        employee.getClients();

        getInstance().employees[6].getClientsSize();

        List<Employee> employeeList = new ArrayList<>();
        List<Employee> results;
        employeeList.sort(Comparator.comparing(Employee::getClientsSize));

        while (option != 2) {
            showMenu();
            option = Utils.ask("", INT);

            if (option == 1)
                login();
            else System.out.println(CLOSING);
        }
    }

    private static void login() {
        String dni = Utils.ask(INSERT_DNI, STRING);
        String password = Utils.ask(INSERT_PASSWORD, STRING);

        for (Employee employee : getInstance().employees) {
            if (employee.getDni().equalsIgnoreCase(dni) &&
                    employee.getPassword().equals(password)) {
                redirectToMenu(employee);
                break;
            }
        }
    }

    private static void showMenu() {
        System.out.println(LOGIN);
        System.out.println(EXIT);
    }

    private static void redirectToMenu(Employee employee) {
        switch (employee.getRank()) {
            case BOSS -> bossMenu();
            case MANAGER -> managerMenu(employee);
            case WORKER -> workerMenu(employee);
        }
    }

    private static void sort() {

        Employee[] sort = new Employee[8];

        int count = 0;
        for (Employee employee : getInstance().employees) {
            if(employee.getRank() == Employee.Rank.WORKER) {
                sort[count] = employee;
                count ++;
            }
        }
        Arrays.sort(getInstance().employees);

        getInstance().employees[0] = null;
        getInstance().employees[1] = null;


    }
}
