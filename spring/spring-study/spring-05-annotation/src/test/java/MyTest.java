import com.by.config.MainConfig;
import com.by.pojo.Person;
import com.by.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-04 3:22
 * @update 2020-10-04 3:22
 */
public class MyTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    /**
     * 测试 Spring Config 类
     */
    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }

    /**
     * 查看容器中的 bean
     */
    @Test
    public void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for(String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
