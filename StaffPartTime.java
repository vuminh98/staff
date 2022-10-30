package ExStaff;

public class StaffPartTime extends Staff implements Comparable<Staff>{
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

    public int getRealSalary() {
        return workingHours * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + getRealSalary();
    }
    @Override
    public int compareTo(Staff staff) {
        return Integer.compare(getRealSalary(), staff.getRealSalary());
    }
}
