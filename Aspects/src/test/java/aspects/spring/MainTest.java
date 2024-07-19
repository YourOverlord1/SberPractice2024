package aspects.spring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testOne() {
        String string1 = "10 10";
        String string2;
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ForTest forTest = context.getBean(ForTest.class);
        string2 = forTest.testOne("10", 10);
        Assert.assertEquals(string1, string2);
    }

    @Test
    void testTwo() {
        String string1 = "Test Test";
        String string2;
        Collection<ArrayList> list = new LinkedList<>();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ForTest forTest = context.getBean(ForTest.class);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> forTest.testTwo(list, null));
        System.out.println(exception.getMessage());
    }
}