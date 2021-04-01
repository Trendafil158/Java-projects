package taskForth;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Employee {

    public static enum Gender {

        MALE, FEMALE
    }

    private String name;
    private Gender gender;
    private LocalDate dob;
    private double income;
    private static UUID employeeID;

    private Employee(String name, Gender gender, LocalDate dob,
                     double income) {

        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.income = income;
        employeeID = UUID.randomUUID();
    }

    public Employee() {
    }

    public Gender getGender()
    {
        return gender;
    }

    public double getIncome() {
        return income;
    }

    public static List<Employee> persons() {
        Employee p1 = new Employee( "Jake", Gender.MALE, LocalDate.of(1971,
                Month.JANUARY, 1), 2343.0);
        Employee p2 = new Employee("Jack", Gender.MALE, LocalDate.of(1972,
                Month.JULY, 21), 7100.0);
        Employee p3 = new Employee( "Jane", Gender.FEMALE, LocalDate.of(1973,
                Month.MAY, 29), 5455.0);
        Employee p4 = new Employee("Jode", Gender.MALE, LocalDate.of(1974,
                Month.OCTOBER, 16), 1800.0);
        Employee p5 = new Employee( "Jeny", Gender.FEMALE, LocalDate.of(1975,
                Month.DECEMBER, 13), 1234.0);
        Employee p6 = new Employee( "Jason", Gender.MALE, LocalDate.of(1976,
                Month.JUNE, 9), 3211.0);

        List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

        return persons;
    }

    public static void statistics()
    {
        int countSum = 0;
        List<Employee> employeeList = persons();
        for(int i = 0; i <= 5; i++)
        {
             countSum += employeeList.get(i).income;
        }
        System.out.print("The whole sum of all employees is: " + countSum);
    }

    public void personsStatsByGenderCount()
    {
        List<Employee> employeeList = persons();

        List<Employee> maleEmployee = new ArrayList<Employee>();
        List<Employee> femaleEmployee = new ArrayList<Employee>();

        int maleCount = 0;
        int femaleCount = 0;

        for(int i = 0; i <= 5; i++)
        {
            if(employeeList.get(i).gender == Gender.MALE)
            {
                maleEmployee.add(employeeList.get(i));
                maleCount++;
            }
            else
            {
                femaleEmployee.add(employeeList.get(i));
                femaleCount++;
            }
        }

        System.out.println("The number of men is: " + maleCount);
        System.out.println("The number of women is: " + femaleCount);
    }

    @Override
    public String toString() {
        return String.format("Employee name: %s \n Gender: %s \n dob: %s \n Employee income: %d \n %s unique employeeID: %s", name,
                             gender, dob, income, employeeID);
    }
}
