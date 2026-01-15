package codesnippet.demo.scopewofbeans;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class HelloService {
    public String sayHello() {
        return "Hello World";
    }

    @PostConstruct
    public void init()
    {
        System.out.println("HelloService with the hashcode"+this.hashCode());
    }
}
