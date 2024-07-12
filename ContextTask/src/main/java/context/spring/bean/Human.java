package context.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Human {
    private String name;
    private Cat cat;
    private Dog dog;
    private Parrot parrot1;
    private Parrot parrot2;
}