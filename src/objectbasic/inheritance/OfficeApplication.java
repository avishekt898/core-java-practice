package objectbasic.inheritance;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class OfficeApplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Abhishek");
        employee.setAddress("19 Williams st");
        employee.setGender("Male");
        employee.setSalary("$5000");
        employee.setId(2063);
        employee.setJoiningDate(LocalDate.now());



        Manager manager = new Manager();
        manager.setName("JanDoe");
        manager.setAddress("Unknown");
        manager.setGender("Female");
        manager.setSalary("$20000");
        manager.setBonus(3000);
        System.out.println("bonus is " + manager.getBonus());


        Director director = new Director();
        director.setBonus(8000);
        director.setSharePercentage(10.75f);
        director.setSsn("2359659");
        director.setName("Leonel");
        director.setGender("Male");
        System.out.println("Director gender is " + director.getGender());


    }
}
