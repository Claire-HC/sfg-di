package claire.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by claire on 21/11/20
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
