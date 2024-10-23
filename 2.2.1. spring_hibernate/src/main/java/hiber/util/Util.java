package hiber.util;

import hiber.model.User;

import java.util.List;

public class Util {

    public static void printUserList(List<User> list) {
        for (User user : list) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println("Car = " + user.getCar().getModel() + " " + user.getCar().getSeries());
            System.out.println();
        }
    }
}
