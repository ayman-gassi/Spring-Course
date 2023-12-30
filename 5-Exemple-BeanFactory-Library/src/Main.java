import coreservlete.Articles;
import coreservlete.Books;
import coreservlete.Library;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Common.xml");
        Library lib = (Library) context.getBean("box");
        for (Books book:lib.getBooks()
        ) {
            System.out.println(book.toString());
        }
        for (Articles article:lib.getArticles()
        ) {
            System.out.println(article.toString());
        }
    }
}