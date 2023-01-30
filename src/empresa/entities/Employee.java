package empresa.entities;

import java.util.Date;

import static empresa.entities.Company.getInstance;
import static empresa.utils.Constants.*;
import static empresa.utils.Utils.Types.INT;
import static empresa.utils.Utils.Types.STRING;
import static empresa.utils.Utils.ask;

public class Employee implements Comparable<Employee>  {

    private int id;
    private String dni;
    private String name;
    private String password;
    private Date hired;
    private Rank rank;
    private int wallet = 0;
    private Company[] clients = new Company[10];

    public Employee(int id, String dni, String name, String password, Rank rank) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.password = password;
        this.hired = new Date();
        this.rank = rank;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getHired() {
        return hired;
    }

    public void setHired(Date hired) {
        this.hired = hired;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public Company[] getClients() {
        return clients;
    }
    public int getClientsSize() {
        return clients.length;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", hired=" + hired +
                ", rank=" + rank +
                '}';
    }


    public static Employee createEmployee(int id) {
        String dni = verifyDni();
        String name = ask(INSERT_NAME, STRING);
        String password = ask(INSERT_PASSWORD, STRING);
        Rank rank = verifyRank();

        return new Employee(id, dni, name, password, rank);
    }
    public enum Rank {
        BOSS, MANAGER, WORKER
    }


    /**
     * VERIFICATIONS
     */
    private static String verifyDni() {
        String dni = ask(INSERT_DNI, STRING);

        for (Employee employee : getInstance().employees) {
            if (dni.equals(employee.getDni())) {
                System.out.println(DNI_USED);
                verifyDni();
            }
        }
        return dni;
    }

    private static Rank verifyRank() {
        do {
            System.out.println(MANAGER_OPTION);
            System.out.println(WORKER_OPTION);
            System.out.println(ABORT_OPTION);
            int option = ask(INSERT_RANK, INT);

            switch (option) {
                case 1 -> {
                    if (getInstance().managersCount < 2)
                        return Rank.MANAGER;
                    else System.out.println(MAX_MANAGERS);
                }
                case 2 -> {
                    if (getInstance().workersCount < 8)
                        return Rank.WORKER;
                    else System.out.println(MAX_WORKERS);
                }
                case 3 -> {
                    System.out.println(ABORT);
                    return null;
                }
            }
        } while (true);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;

        return id == employee.id;
    }

    @Override
    public int compareTo(Employee o) {

        if(o == null)
            return 0;

        if(this.getClientsSize() > o.getClientsSize())
            return 0;
        else return 1;
    }

    @Override
    public int hashCode() {
        return wallet;
    }




}
