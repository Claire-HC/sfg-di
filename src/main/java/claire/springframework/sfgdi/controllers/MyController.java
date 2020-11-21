package claire.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by claire on 21/11/20
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");

        return "Hi Folks";
    }
}
