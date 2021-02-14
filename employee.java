public class employee {

    private String fullName;
    private String position;
    private String phone;
    private int salary;
    private int age;

    public employee() {
        fullName = "Иванов Иван Иванович";
        position = "эксперт";
        phone = "+79991231231";
        salary = 50000;
        age = 30;
    }

    public employee(String fullName, String position, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
        }

    public String getPhone() {
        return phone;
        }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary (int newSalary) {
        salary = newSalary;
    }

}
