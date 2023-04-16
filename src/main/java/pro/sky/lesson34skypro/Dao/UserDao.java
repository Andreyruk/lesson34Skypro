package pro.sky.lesson34skypro.Dao;

import pro.sky.lesson34skypro.User;

import java.util.List;

public interface UserDao {

    User getUserByName(String name);

    List<User> findAllUsers();
}
