import java.util.*;
public class Tester {
    public static void main(String...args)
    {
        Employee emp1 = new Employee(101,"TAUQUIR",78000.9,
                "MUKUNDAPUR");
        Employee emp2 = new Employee(102,"SHABBAR",178000.9,
                "MUKUNDAPUR123");
        Employee emp3 = new Employee(103,"REBELLION",268000.9,
                "MUKUNDAPUR654");
        Employee emp4 = new Employee(104,"TIGER",78000.9,
                "MUKUNDAPUR876");
        TreeSet<Employee> ts = new TreeSet<Employee>();
        ts.add(emp4);
        ts.add(emp3);
        ts.add(emp1);
        ts.add(emp2);
        System.out.println(ts);

    }
}
