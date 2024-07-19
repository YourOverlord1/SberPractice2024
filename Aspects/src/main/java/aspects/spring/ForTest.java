package aspects.spring;

import org.springframework.stereotype.Component;
import java.util.Collection;

@Component
public class ForTest {
    @NotEmpty
    public String testOne(String s, Integer d) {
        String string;
        string = s + ' ' + d.toString();
        return string;
    }

    @NotEmpty
    public String testTwo(Collection c, String s) {
        String string;
        string = c.toString() + ' ' + s;
        return string;
    }
}