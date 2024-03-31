package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user/*, Car car*/);
//void add(Car car);
   List<User> listUsers();
//   List<Car> listCars();
   List<User> uModel(String str, int series);
}
