package empresa.service;

import empresa.entities.Employee;

import static empresa.utils.Constants.*;
import static empresa.utils.Utils.Types.INT;
import static empresa.utils.Utils.ask;

public class WorkerMenu {

    public static void workerMenu(Employee employee) {

        int option;

        do {
            showWorkerMenu();
            option = ask("", INT);



        } while (option != 5);
    }

    private static void showWorkerMenu() {
        System.out.println(BOSS_OPTION_1);
        System.out.println(BOSS_OPTION_2);
        System.out.println(BOSS_OPTION_3);
        System.out.println(BOSS_OPTION_4);
        System.out.println(BOSS_OPTION_5);
    }
}
