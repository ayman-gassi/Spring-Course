import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-Commmon.xml"});
        OutputHelper outputHelper = (OutputHelper) context.getBean("OutputHelper");
        outputHelper.generateOutput();
    }
}