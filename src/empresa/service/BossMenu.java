package empresa.service;

import empresa.entities.Employee;

import static empresa.entities.Company.getInstance;
import static empresa.utils.Constants.*;
import static empresa.utils.Utils.Types.INT;
import static empresa.utils.Utils.Types.STRING;
import static empresa.utils.Utils.ask;

public class BossMenu {

    public static void bossMenu() {

        int option;
        Employee[] employees = getInstance().employees;

        do {
            showBossMenu();
            option = ask("", INT);

            switch (option) {
                case 1 -> addEmployee(employees);
                case 2 -> listEmployees(employees);
                case 3 -> fireEmployee(employees);
                case 4 -> closeBusiness();
                case 5 -> System.out.println(CLOSING_BOSS_MENU);
                default -> System.out.println(INVALID);
            }

        } while (option != 5);

        //Verify if update getInstance().employees is required
    }

    private static void addEmployee(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null)
                employees[i] = Employee.createEmployee(i);
        }
    }

    private static void listEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void fireEmployee(Employee[] employees) {
        String dni = ask(DNI_FIRE, STRING);

        for (Employee employee : employees)
            if (employee.getDni().equals(dni)) {
                employees[employee.getId()] = null;
                System.out.println(EMPLOYEE_DNI_FIRED);
            }
    }

    private static void closeBusiness() {
        //TODO
    }

    private static void showBossMenu() {
        System.out.println(BOSS_OPTION_1);
        System.out.println(BOSS_OPTION_2);
        System.out.println(BOSS_OPTION_3);
        System.out.println(BOSS_OPTION_4);
        System.out.println(BOSS_OPTION_5);
    }

}
