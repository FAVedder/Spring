package app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class View1 implements View{
    @Override
    public void show() {
        System.out.println("Hello world");
    }
}
