package ExStaff;

public class StaffPartTime extends Staff{
    private int workingHours;

    public StaffPartTime() {
    }

    public StaffPartTime(int workingHours) {
        this.workingHours = workingHours;
    }

    public StaffPartTime(String code, String name, int age, String tel, String email, int workingHours) {
        super(code, name, age, tel, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "StaffPartTime{" +
                "workingHours=" + workingHours +
                '}';
    }
}
