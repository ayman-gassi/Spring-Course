import coreservlete.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("Spring-Common.xml");
        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloworld");
        helloWorld.execute();
        HelloWorld helloWorldV2 = (HelloWorld) beanFactory.getBean("helloworldV2");
        helloWorldV2.execute();
    }
}