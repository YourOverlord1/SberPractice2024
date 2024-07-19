package context.spring.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Human {
    private String name;
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    @Autowired
    private Parrot parrot1;
    @Autowired
    private Parrot parrot2;
}