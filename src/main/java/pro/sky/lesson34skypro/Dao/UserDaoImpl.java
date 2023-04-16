package pro.sky.lesson34skypro.Dao;

import pro.sky.lesson34skypro.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    List<User> users;

    public UserDaoImpl() {
        users = new ArrayList<>();
        users.add(new User("Fedor"));
        users.add(new User("Michail"));
        users.add(new User("Kolya"));
    }

    @Override
    public User getUserByName(String name) {
        return users.stream().filter(item -> item.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
