import com.by.pojo.Hello;
import com.by.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-03 3:06
 * @update 2020-10-03 03:08:48
 */
public class MyTest {

    @Test
    public void test01() {
        // 获取 Spring 上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象，现在可以给 context 管理，我们要用的时候，从里面取出来即可
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
            在获取上下文的时候，这个 bean 已经被创建了
            配置的属性，也注入进去了
         */
        System.out.println("############");
        User user = (User)context.getBean("user3");
        user.show();
    }

}
