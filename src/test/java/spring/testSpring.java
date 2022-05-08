package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: baifengxiao
 * @date: 2022/3/24 15:46
 */
public class testSpring {

    //体会spring创建对象的方式
    @Test
    public void Testbean1(){
        //1 加载 spring 配置文件
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        //2 获取配置创建的对象
        User user=context.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }

    //bean2，测试注入属性
    @Test
    public void Testbean2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book.getUserDao().getName());

    }
}
