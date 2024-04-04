package hiber.dao;

import hiber.model.User;
import hiber.model.Car;
import hiber.service.UserService;
import hiber.service.UserServiceImp;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);

   }
   @Override
   public void car_for_user(Car car) {
      sessionFactory.getCurrentSession().save(car);

   }

   @Override

   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

   @Override

   public List<User> uModel(String str, int series) {
            TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User u where u.car.model = '"+str+
              "' and  u.car.series = " + series);

      return query.getResultList();
   }

}
