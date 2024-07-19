package aspects.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.Collection;
import java.util.Optional;

@Aspect
@Component
public class NotAspect {
    @Before("@annotation(NotEmpty)")
    public void check(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        for (Object args : arguments) {
            Optional.of(args);
            if (args.getClass().equals(String.class)) {
                if (((String) args).isEmpty()) {
                    System.out.println("Cтрока null");
                }
            } else if (args.getClass().equals(Collection.class)) {
                if (((Collection) args).isEmpty()) {
                    System.out.println("Коллекция null");
                }
            }
        }
    }
}