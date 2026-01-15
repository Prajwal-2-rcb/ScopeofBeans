package codesnippet.demo.scopewofbeans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Blogger {

    @Autowired
    User user;

    @Autowired
    User1 user1;

    public Blogger() {
        System.out.println("Blogger");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("CBlogger Hashcode "+this.hashCode()+"user hashcode "+user.hashCode()+
                "user1 hashcode "+user1.hashCode());
    }
}
