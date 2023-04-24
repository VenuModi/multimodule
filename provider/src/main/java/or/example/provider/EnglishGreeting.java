package or.example.provider;

import org.example.service.Greeting;

import javax.swing.*;

public class EnglishGreeting implements Greeting {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
