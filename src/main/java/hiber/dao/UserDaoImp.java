package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
//import javax.SQLQuery.*;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user/*, Car car*/) {

      sessionFactory.getCurrentSession().save(user);
//      sessionFactory.getCurrentSession().save(car);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> uModel(String str, int series) {
      //TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User where model = :paramName");
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User u where u.ecars.model = '"+str+
              "' and  u.ecars.series = " + series);

      return query.getResultList();
   }

   /*@Override
   @SuppressWarnings("unchecked")
   public List<Car> listCars() {
      TypedQuery<Car> query=sessionFactory.getCurrentSession().createQuery("from Car");
      return query.getResultList();
   }*/

}
