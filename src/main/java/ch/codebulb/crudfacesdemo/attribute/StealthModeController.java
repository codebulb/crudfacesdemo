package ch.codebulb.crudfacesdemo.attribute;

import java.io.Serializable;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@ViewScoped
@Named
public class StealthModeController implements Serializable {
    private boolean shown;

    public boolean isShown() {
        return shown;
    }

    public void setShown(boolean shown) {
        this.shown = shown;
    }
    
    public void switchShown() {
        shown = !shown;
    }
    
    public String getControlText() {
        return shown ? "Hide dangerous button" : "Show dangerous button";
    }
}
