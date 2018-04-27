package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    
    @Autowired
    Controller controller;
    
    public void start() {
        controller.showView();
    }
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Controller.class, View1.class);
        Application application = context.getBean(Application.class);
        application.start();
    }
}
