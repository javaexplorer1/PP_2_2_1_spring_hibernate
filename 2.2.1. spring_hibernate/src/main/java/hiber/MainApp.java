package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import hiber.util.Util;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Car("BMW", 7)));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru", new Car("Mazda", 3)));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru", new Car("Ford", 2)));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru", new Car("Mazda", 3)));

      System.out.println("All users:");
      Util.printUserList(userService.listUsers());

      System.out.println("Users who have a \"Mazda 3\" car:");
      Util.printUserList(userService.findByModelAndSeries("Mazda", 3));

      context.close();
   }
}
