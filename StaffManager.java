package ExStaff;

import java.util.*;

public class StaffManager {
    private final ArrayList<Staff> staffs;

    public StaffManager() {
        staffs = new ArrayList<>();
    }

    public void displayListStaff() {
        staffs.add(new StaffFullTime("A1", "STAFF1", 20, "0964613519", "ASHDGJKHASGJKHDHB@GMAIL.COM", 50000, 100000, 30000000));
        staffs.add(new StaffFullTime("A2", "STAFF2", 21, "0968765434", "ASHDGJgsdcxzcvxcv@GMAIL.COM", 70000, 200000, 20000000));
        staffs.add(new StaffFullTime("A3", "STAFF3", 22, "0962341343", "ASasdqwerzxcB@GMAIL.COM", 30000, 100000, 10000000));
        staffs.add(new StaffFullTime("A4", "STAFF4", 23, "0934531232", "ASHasdqwezxc@GMAIL.COM", 20000, 200000, 110000000));
        staffs.add(new StaffFullTime("A5", "STAFF5", 24, "0784652312", "ASasdqweqwedB@GMAIL.COM", 80000, 150000, 90000000));
        staffs.add(new StaffPartTime("A6", "STAFF6", 25, "07678567862", "ASHDHSAHJKD@GMAIL.COM", 8));
        staffs.add(new StaffPartTime("A7", "STAFF7", 26, "07567856745", "ASHDHSAHJKD@GMAIL.COM", 5));
        staffs.add(new StaffPartTime("A8", "STAFF8", 27, "07123414122", "ASHDHSAHJKD@GMAIL.COM", 6));
        staffs.add(new StaffPartTime("A9", "STAFF9", 28, "01235647576", "ASHDHSAHJKD@GMAIL.COM", 10));
        staffs.add(new StaffPartTime("A10", "STAFF10", 29, "0712312334562", "ASHDHSAHJKD@GMAIL.COM", 24));
        for (Staff staff : staffs) {
            System.out.println(staff);
        }
    }

    public void calculateSalaryForStaff() {
        int salary = 0;
        for (Staff staff : staffs) {
            if (staff instanceof StaffFullTime) {
                salary = ((StaffFullTime) staff).getSalaryFT() + (((StaffFullTime) staff).getBonusMoney() - ((StaffFullTime) staff).getFineMoney());
            } else if (staff instanceof StaffPartTime) {
                salary = ((StaffPartTime) staff).getWorkingHours() * 100000;
            }
            System.out.println(staff);
            System.out.println("Salary for Staff: " + salary + "\n");
        }
    }


    public void calculateSalaryAvgForAllCompany(int choice, Scanner scanner) {
        try {
            if (choice < 1 || choice > 2) {
                System.out.println("Please choose again: ");
            } else {
                int salaryFT = 0;
                int salaryPT = 0;
                int salaryAvg;
                for (Staff staff : staffs) {
                    if (staff instanceof StaffFullTime) {
                        salaryFT += ((StaffFullTime) staff).getSalaryFT() + (((StaffFullTime) staff).getBonusMoney() - ((StaffFullTime) staff).getFineMoney());
                    } else if (staff instanceof StaffPartTime) {
                        salaryPT += ((StaffPartTime) staff).getWorkingHours() * 100000;
                    }
                }
                if (choice == 1) {
                    salaryAvg = (salaryFT + salaryPT) / staffs.size();
                    System.out.println("The salary Avg for all company is: " + salaryAvg);
                } else {
                    salaryAvg = (salaryFT + salaryPT) / staffs.size();
                    for (int i = 0; i < staffs.size() - 5; i++) {
                        if (((StaffFullTime) staffs.get(i)).getSalaryFT() + (((StaffFullTime) staffs.get(i)).getBonusMoney() - ((StaffFullTime) staffs.get(i)).getFineMoney()) > salaryAvg) {
                            staffs.remove(staffs.get(i));
                            System.out.println(staffs.get(i).getName());
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Your information is not exactly! Please choose again!");
        }
    }

    public void calculateSalaryForAllStaffPT() {
        int sum = 0;
        for (int i = 3; i <= 7; i++) {
            sum += ((StaffPartTime) staffs.get(i)).getWorkingHours() * 100000;
        }
        System.out.println("ALl of salary for StaffPT: " + sum);
    }

    public void sortSalaryOfStaffFullTime() {
        Collections.sort(staffs, new StaffFullTime() {
            public int compare(StaffFullTime o1 , StaffFullTime o2) {
                return o1.getSalaryFT() - o2.getSalaryFT();
            }
        });
        displayListStaff();
    }
}


