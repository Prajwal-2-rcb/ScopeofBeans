package codesnippet.demo.scopewofbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    public UserController() {
        System.out.println("UserController with the hashcode "+this.hashCode());
    }

    @GetMapping("/hello")
    public String hello() {
        return userService.sayHello();
    }

}
