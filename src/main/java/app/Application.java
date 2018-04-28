package app;

import java.io.FileNotFoundException;
import java.util.Scanner;
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
        View view = null;
        String viewInt = null;
        java.io.File file = new java.io.File("view.txt");
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
            viewInt  = input.nextLine();
            }
        } 
        catch(FileNotFoundException e) {
            e.getStackTrace();
        }
        switch (viewInt) {
            case "1": view = new View1(); break;
            case "2": view = new View2(); break;
            default : view = null; break;
        }
        return view;
    }
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Application application = context.getBean(Application.class);
        application.start();
    }
}
