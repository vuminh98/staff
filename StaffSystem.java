package ExStaff;

import java.util.Scanner;

public class StaffSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StaffManager staffManager = new StaffManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Display all staff");
            System.out.println("2. Calculate salary for all staff");
            System.out.println("3. SalaryAvg for all staff");
            System.out.println("4. SalaryAgv for all staff part-time");
            System.out.println("5. Sort salary of staff full-time");
            System.out.println("0. Exit");
            System.out.println("Input choice: ");
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please choose again: ");
            }
            switch (choice) {
                case 1:
                    staffManager.displayListStaff();
                    break;
                case 2:
                    staffManager.calculateSalaryForStaff();
                    break;
                case 3:
                    menuCalculateSalary(scanner, staffManager);
                    break;
                case 4:
                    staffManager.calculateSalaryForAllStaffPT();
                    break;
                case 5:
                    staffManager.sortSalaryOfStaffFullTime();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void menuCalculateSalary(Scanner scanner, StaffManager staffManager) {
        do {
            System.out.println("Input your choice: ");
            System.out.println("1. SalaryAvg for all staffs");
            System.out.println("2. List staffs has salary smaller than salaryAvg");
            System.out.println("0. Return");
            System.out.println("Input choice: ");
            int choice2 = -1;
            try {
                choice2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please choose again: ");
            }
            if (choice2 == 0) {
                break;
            }
            staffManager.calculateSalaryAvgForAllCompany(choice2, scanner);
        } while (true);
    }

}
