package src;

import java.util.Locale;

public class EmployeeFactory {

    public Employee createEmployee(String empType) {
        if (empType.trim().toLowerCase(Locale.ROOT).equals("hr")) {
            return new Hr();
        } else if (empType.trim().toLowerCase(Locale.ROOT).equals("software")) {
            return new SoftwareEng();
        } else if (empType.trim().toLowerCase(Locale.ROOT).equals("admin")) {
            return new Admin();
        } else return null;

    }
}
