package ch.codebulb.crudfacesdemo.scopes;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class RequestScopedBean {
    private String text = "(no text set)";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String updateText() {
        text = "I'm a @RequestScoped controller.";
        return "flashBeans.xhtml?faces-redirect=true";
    }
}
