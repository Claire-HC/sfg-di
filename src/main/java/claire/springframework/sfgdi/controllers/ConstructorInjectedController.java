package claire.springframework.sfgdi.controllers;

import claire.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by claire on 21/11/20
 */
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
    
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
