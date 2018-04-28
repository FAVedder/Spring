package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    @Autowired
    @Qualifier("BoontjeKomtOmZijnLoontje")
    View view;
    
    public Controller(View view) {
        this.view = view;
    }
    
    public void showView() {
        view.show();
    }
}
