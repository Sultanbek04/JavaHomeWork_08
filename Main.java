package com.google.lesson_08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sultanbek", "Myrzakhmet", 18, Gender.MALE,
                "sm2222@sussex.ac.uk", "Kazakhstan");
        User user2 = new User("Amandos", "Bolatov", 21, Gender.MALE,
                "amandos@gmail.com", "Kazakhstan");
        User user3 = new User("Polina", "Ludmilovna", 20, Gender.FEMALE,
                "polina2000@gmail.com", "Ukraine");

        Employee employee = new Employee(20000, "Programmer", "IT");
        User user5 = new Employee("Alina", "Bulatovna", 22, Gender.FEMALE,
                "alina1900@gmail.com", "Ukraine", 5000,
                "Manager", "Sales");

        User user4 = new Employee("Arman", "Kulakov", 17, Gender.MALE, "arman@mail.ru", "Russia",
                10000, "Professor", "Libary");

        List<User> list = new ArrayList<>();
        list.add(user5);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(employee);

        list.stream().filter(s -> s.getClass().equals(User.class)).forEach(s -> System.out.println(s));
        System.out.println(list
                .stream()
                .collect(Collectors.averagingInt(s -> s.getAge())));
        System.out.println(list
                .stream()
                .filter(s -> s.getAge() < 18)
                .collect(Collectors.averagingInt(s -> s.getAge())));

        System.out.println(list
                .stream()
                .filter(s -> s.getClass().equals(Employee.class))
                .collect(Collectors.averagingDouble(
                        s -> ((Employee) s).getSalary())));

        list
                .stream().filter(s -> s.getMail() != null && s.getMail().endsWith("gmail.com"))
                .forEach(s -> System.out.println(s));

        list
                .stream()
                .filter(s -> s.getGender() == Gender.FEMALE && s.getAge() > 17 && s.getAge() <= 30 && s.getCountry() == "Ukraine"
                        && s.getClass().equals(Employee.class))
                .forEach(s -> System.out.println(s.getMail()));


    }
}
