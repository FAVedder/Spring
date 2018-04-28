package app;

import org.springframework.stereotype.Component;

@Component("DeTweedeView")
public class View2 implements View{
    @Override
    public void show() {
        System.out.println("Goodbye World");
    }
}
