package codesnippet.demo.scopewofbeans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
@RequestMapping("/Hello")
public class HellOController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("Hello World");
        return helloService.sayHello();
    }

    @PostConstruct
    public void init()
    {
        System.out.println("HelloController session Hashcode"+this.hashCode());
    }


}
