package ch02;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("Lee");
//        System.out.println(employeeLee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Kim");
//        employeeKim.serialNum ++;

//        System.out.println(employeeLee.serialNum);
//        System.out.println(employeeKim.serialNum);

        System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());

        System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim.serialNum);


    }
}
