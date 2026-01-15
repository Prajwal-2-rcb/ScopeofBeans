package codesnippet.demo.scopewofbeans;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {
    public User() {
        System.out.println("User created");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("User initialized with hashcode "+this.hashCode());
    }
}
