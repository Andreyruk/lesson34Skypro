package pro.sky.lesson34skypro.Dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.lesson34skypro.User;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class UserDaoTest {

    private UserDao userDao;

    @BeforeEach
    void setUp() {
        this.userDao = new UserDaoImpl();
    }

    @Test
    public void test1() {
        User user = new User("Fedor");
        assertNotNull(userDao.getUserByName(user.getName()));
    }

    @Test
    public void test2() {
        User user = new User("Petya");
        assertNull(userDao.getUserByName(user.getName()));
    }
}