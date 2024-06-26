package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);


//      userService.add(new User("2", "2", "2", new Car("LADA",556)));


//      userService.add(new User("User2w3", "Lastnwame2", "user2@mail.ru"));
      //userService.add(new User("User3", "Lastname3", "user3@mail.ru", new Car("Tesla",453)));
     /* userService.add(new User("User1", "Lastname1", "user1@mail.ru", new Car("Tesla",342)));
      userService.add(new User("User2", "Lastname2", "user2@mail.ru", new Car("Ferrari",333)));
      userService.add(new User("User3", "Lastname3", "user3@mail.ru", new Car("LADA",556)));
      userService.add(new User("User4", "Lastname4", "user4@mail.ru", new Car("Ford",888)));
*/
      /*List<User> users = userService.listUsers();
            for (User user : users) {
               System.out.println(user+" "+user.getecars());
                                     }*/
      //System.out.println(userService.uModel("LADA", 556));
     /*    System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println(user.getecars());
         System.out.println();
      }*/

      List<User> users = userService.uModel("LADA", 556);
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println(user.getecars());
         System.out.println();
      }


      context.close();
   }
}
