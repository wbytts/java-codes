import com.by.service.UserService;
import com.by.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 23:04
 */
public class MyTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService3", UserService.class);
        userService.insert();
        System.out.println("------------------------------------------");
        userService.delete();
        System.out.println("------------------------------------------");
        userService.update();
        System.out.println("------------------------------------------");
        userService.select();
    }

}
