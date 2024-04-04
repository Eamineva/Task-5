package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void car_for_user(Car car);

    List<User> listUsers();

    List<User> uModel(String str, int series);
}
