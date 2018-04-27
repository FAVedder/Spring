package app;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
    @Autowired
    View view;
    
    public Controller(View view) {
        this.view = view;
    }
    
    public void showView() {
        view.show();
    }
}
