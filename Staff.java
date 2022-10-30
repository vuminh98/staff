package ExStaff;

public class Staff {
    private String code;
    private String name;
    private int age;
    private String tel;
    private String email;

    public Staff() {
    }

    public Staff(String code, String name, int age, String tel, String email) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Staff has code: "
                + code;

    }
}
