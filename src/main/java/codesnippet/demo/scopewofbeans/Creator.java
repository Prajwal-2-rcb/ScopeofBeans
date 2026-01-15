package codesnippet.demo.scopewofbeans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Creator {

    @Autowired
    User user;

    @Autowired
    User1 user1;

    public Creator() {
        System.out.println("Creating a new user");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Creating a creator "+this.hashCode()+" user hashcode "+user.hashCode()+
                " user1 hashcode "+user1.hashCode());
    }

}
