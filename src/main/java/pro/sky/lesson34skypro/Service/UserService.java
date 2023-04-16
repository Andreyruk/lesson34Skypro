package pro.sky.lesson34skypro.Service;

import lombok.AllArgsConstructor;
import pro.sky.lesson34skypro.Dao.UserDao;
import pro.sky.lesson34skypro.User;

@AllArgsConstructor
public class UserService {
    private final UserDao userDao;

    public boolean checkUserExist(User user) {
        User u = userDao.getUserByName(user.getName());
        return u != null;
    }
}
