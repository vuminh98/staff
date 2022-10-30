package ExStaff;

public class StaffFullTime extends Staff{
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

    public void setSalaryFT(int salaryFT) {
        this.salaryFT = salaryFT;
    }

    @Override
    public String toString() {
        return "StaffFullTime"
                + super.toString();
    }
}
