package hiber.dao;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserDao {
   void add(User user/*, Car car*/);

   void car_for_user(Car car);

   List<User> listUsers();

   List<User> uModel(String str, int series);
}
