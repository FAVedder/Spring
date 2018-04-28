package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Application {
    
    @Autowired
    Controller controller;
    
    public void start() {
        controller.showView();
    }
    
    @Bean
    public View getView() {
        return new View2();
    }
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application application = context.getBean(Application.class);
        application.start();
    }
}
