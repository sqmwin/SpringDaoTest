package jdbcTemplate;

import com.sqm.springdao.dao.UserDao;
import com.sqm.springdao.dao.impl.UserDaoImpl;
import com.sqm.springdao.pojo.User;
import com.sqm.springdao.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class JdbcTemplateTest {
    private ApplicationContext context;
    private UserService service;
    private UserDao userDao;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("context/spring-jdbc-template-context.xml");
        //service = (UserService) context.getBean("myService");
        userDao = (UserDao) context.getBean("userDaoTarget");
    }

    //insert
    @Test
    public void test01() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(25);
        userDao.insertUser(user);
    }

    //delete
    @Test
    public void test02() {
        int id = 6;
        userDao.deleteUser(5);
    }

    //update
    @Test
    public void test03() {
        User user = new User();
        user.setId(4);
        user.setUsername("lisi");
        user.setAge(22);
        userDao.updateUser(user);
    }

    //select username返回基本类型
    @Test
    public void test04() {
        int id = 3;
        int age = 25;
        String username = userDao.selectUsernameById(id);
        System.out.println(username);
        List<String> usernames = userDao.selectUsernamesByAge(age);
        System.out.println(usernames);

    }

    //selectuserbyid
    @Test
    public void test05() {
        int id = 2;
        User user = userDao.selectUserById(id);
        System.out.println(user);
    }

    //selectalluser
    @Test
    public void test06() {
        List<User> users = userDao.selectAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
