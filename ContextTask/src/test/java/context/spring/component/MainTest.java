package context.spring.component;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainTest {

    @Test
    void main() {
        String waitStr = "Генка";
        String riderStr = "";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Human human = context.getBean(Human.class);
        human.getCat().setName("Найгер");
        human.getParrot1().setName("Антон");
        Human human1 = new Human();
        riderStr = human.getParrot1().getName();
        System.out.println(human.getParrot1().getName());
    }
}