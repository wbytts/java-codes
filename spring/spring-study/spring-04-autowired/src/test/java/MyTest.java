import com.by.pojo.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-04 2:29
 * @update 2020-10-04 2:29
 */
public class MyTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("person3", Person.class);
        System.out.println(person);
        person.getDog().shout();
        person.getCat().shout();
    }

}
