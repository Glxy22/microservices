package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamofEmp {
    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };
    List<Employee> empList = Arrays.asList(arrayOfEmps);

}
