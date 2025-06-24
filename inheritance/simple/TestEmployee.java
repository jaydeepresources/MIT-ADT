package inheritance.simple;

public class TestEmployee {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        permanentEmployee.id = 111;
        permanentEmployee.name = "John Doe";
        permanentEmployee.basicSalary = 10000f;

        permanentEmployee.calculateSalary();
        permanentEmployee.display();

    }
}
