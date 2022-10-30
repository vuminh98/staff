package ExStaff;

import java.util.Comparator;

public  class StaffFullTime extends Staff {
    private int BonusMoney;
    private int FineMoney;
    private int salaryFT;

    public StaffFullTime() {
    }

    public StaffFullTime(int bonusMoney, int fineMoney, int salaryFT) {
        BonusMoney = bonusMoney;
        FineMoney = fineMoney;
        this.salaryFT = salaryFT;
    }

    public StaffFullTime(String code, String name, int age, String tel, String email, int bonusMoney, int fineMoney, int salaryFT) {
        super(code, name, age, tel, email);
        BonusMoney = bonusMoney;
        FineMoney = fineMoney;
        this.salaryFT = salaryFT;
    }

    public int getBonusMoney() {
        return BonusMoney;
    }

    public void setBonusMoney(int bonusMoney) {
        BonusMoney = bonusMoney;
    }

    public int getFineMoney() {
        return FineMoney;
    }

    public void setFineMoney(int fineMoney) {
        FineMoney = fineMoney;
    }

    public int getSalaryFT() {
        return salaryFT;
    }

    public int getRealSalary() {
        return salaryFT + BonusMoney - FineMoney;
    }

    public void setSalaryFT(int salaryFT) {
        this.salaryFT = salaryFT;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + getRealSalary();
    }
public int compareTo(Staff staff) {
        if (getRealSalary() < staff.getRealSalary()) return -1;
        else if (getRealSalary() > staff.getRealSalary()) return 1;
        else return 0;
    }
}
