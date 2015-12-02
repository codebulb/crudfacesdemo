package ch.codebulb.crudfacesdemo.componenthandler;

import ch.codebulb.crudfacesdemo.crud.model.OptionalCustomer;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@ViewScoped
@Named
public class ReadOnlyController implements Serializable {
    private boolean readOnly = false;
    private OptionalCustomer entity = new OptionalCustomer();
    
    @PostConstruct
    protected void initEntity() {
        entity.setFirstName("Org");
    }
    
    public void switchReadOnly() {
        readOnly = !readOnly;
    }
    
    public String getControlText() {
        return readOnly ? "Make editable" : "Make read-only";
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public OptionalCustomer getEntity() {
        return entity;
    }

    public void setEntity(OptionalCustomer entity) {
        this.entity = entity;
    }
}
