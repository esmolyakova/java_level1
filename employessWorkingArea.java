import java.util.Arrays;

public class employessWorkingArea {
    public static void main(String[] args) {
        employee employee1 = new employee();
        System.out.println(employee1.getFullName());
        System.out.println(employee1.getPosition());

        employee[] employeeArray = new employee[5];
        employeeArray[0] = new employee("Джон Кейдж", "композитор", "+79990000000", 23300, 45);
        employeeArray[1] = new employee("Энди Уорхол", "арт-директор", "+79110000000", 45000, 50);
        employeeArray[2] = new employee("Джон Китс", "штатный поэт", "+79230000000", 60000, 45);
        employeeArray[3] = new employee("Винсент Ван Гог", "художник", "+79290000000", 100000, 37);
        employeeArray[4] = new employee("Александр Михайлович Родченко", "фотограф", "+79990000000", 35000, 30);

        System.out.println("Сотрудники старше 40 лет: ");
        for (employee employee : employeeArray) {
            if (employee.getAge() > 40) {
                System.out.println("ФИО: " + employee.getFullName());
                System.out.println("Возраст: " + employee.getAge());
                System.out.println("--------");
            }

        }
        promotion();
    }

    public static void promotion() {
        employee[] employeeArray = new employee[5];
        employeeArray[0] = new employee("Джон Кейдж", "композитор", "+79990000000", 23300, 45);
        employeeArray[1] = new employee("Энди Уорхол", "арт-директор", "+79110000000", 45000, 50);
        employeeArray[2] = new employee("Джон Китс", "штатный поэт", "+79230000000", 60000, 45);
        employeeArray[3] = new employee("Винсент Ван Гог", "художник", "+79290000000", 100000, 37);
        employeeArray[4] = new employee("Александр Михайлович Родченко", "фотограф", "+79990000000", 35000, 30);
        for (employee employee : employeeArray) {
            if (employee.getAge() > 35) {
                employee.setSalary(employee.getSalary() + 10000);
                System.out.println("Зарплата " + employee.getFullName() + " повышена до " + employee.getSalary());
            }

        }

    }
}
