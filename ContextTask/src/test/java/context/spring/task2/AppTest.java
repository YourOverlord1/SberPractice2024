package context.spring.task2;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppTest {

    @Test
    void checkUser() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Application application = context.getBean(Application.class);
        application.getBankClientsApp().setOurСlients(true);
        application.checkUser();
    }
}