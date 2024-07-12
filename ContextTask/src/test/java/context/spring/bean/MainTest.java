package context.spring.bean;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    @Test
    void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Parrot parrot = context.getBean("parrot", Parrot.class);
        System.out.println(parrot.getName());
    }
}