package context.spring.component;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Data
@Component
public class Parrot {
    private String name;
}
