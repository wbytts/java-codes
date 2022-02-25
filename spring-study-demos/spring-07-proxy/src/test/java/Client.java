import com.by.*;
import org.junit.Test;

/**
 * 客户
 * @author wangby
 * @version 0.0.1
 * @date 2020-10-05 16:19
 */
public class Client {
    @Test
    public void test01() {
        // 房东要租房子
        Host host = new Host();
        // 中介代理房东，帮他租房子
        Proxy proxy = new Proxy(host);
        // 中介租房子
        proxy.rent();
    }

    // 动态代理测试
    @Test
    public void test02() {
        // 真实角色
        Host host = new Host();
        // 生成代理角色，目前没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 调用处理程序来处理我们要调用的对象
        pih.setRent(host);

        Rent proxy = (Rent)pih.getProxy();
        proxy.rent();
    }

    @Test
    public void test03() {
        Host host = new Host(); // 真实角色
        PIH pih = new PIH(); // 创建要代理的角色
        pih.setTarget(host); // 设置要代理的对象
        Rent proxy = (Rent) pih.getProxy(); // 动态生成代理类
        proxy.rent();
    }
}
