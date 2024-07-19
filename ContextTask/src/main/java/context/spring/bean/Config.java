package context.spring.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Cat cat() {
        return new Cat("Мурка");
    }

    @Bean
    public Dog dog() {
        return new Dog("Боба");
    }

    @Bean
    public Parrot parrot1() {
        return new Parrot("Рэпер");
    }

    @Bean
    public Parrot parrot2() {
        return new Parrot("Попка");
    }


    @Bean
    public Human human(Cat cat, Dog dog, Parrot parrot1, Parrot parrot2) {
        return new Human("Дмитрий", cat, dog, parrot1, parrot2);
    }


}