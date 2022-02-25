import com.by.config.SpringConfig;
import com.by.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-04 3:41
 * @update 2020-10-04 3:41
 */
public class MyTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

}
