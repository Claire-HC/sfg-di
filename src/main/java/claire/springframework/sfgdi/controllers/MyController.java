package claire.springframework.sfgdi.controllers;

import claire.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

/**
 * Created by claire on 21/11/20
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(@Qualifier("primaryGermanGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Helllo!!!");

        return greetingService.sayGreeting();
    }
}
