package codesnippet.demo.scopewofbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User1 {

    public User1() {
        System.out.println("User1 constructor"+this.hashCode());
    }

}
