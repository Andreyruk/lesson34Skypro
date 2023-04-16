package pro.sky.lesson34skypro.Service;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.lesson34skypro.Dao.UserDao;
import pro.sky.lesson34skypro.User;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserDao userDao;

    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.initMocks(this);
        this.userService = new UserService(userDao);
    }

    @Test
    public void testTrue() {
        User user = new User("Fedor");
        when(userDao.getUserByName(user.getName())).thenReturn(user);
        assertTrue(this.userService.checkUserExist(user));
    }

    @Test
    public void testFalse() {
        User user = new User("Fedor1");
        when(userDao.getUserByName(user.getName())).thenReturn(null);
        assertFalse(this.userService.checkUserExist(user));
    }
}