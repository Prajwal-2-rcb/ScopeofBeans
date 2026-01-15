package codesnippet.demo.scopewofbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class UserService {

    public UserService() {
        System.out.println("UserService with the hashcode "+this.hashCode());
    }
    public String sayHello() {
        return "Hello World";
    }
}
