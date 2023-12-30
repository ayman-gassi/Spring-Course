import coreservlete.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contect = new ClassPathXmlApplicationContext("Spring-Common.xml");
        Shape cercle = (Shape) contect.getBean("cercle");
        System.out.println(cercle.Calcul());
        Shape square = (Shape) contect.getBean("square");
        System.out.println(square.Calcul());
    }
}