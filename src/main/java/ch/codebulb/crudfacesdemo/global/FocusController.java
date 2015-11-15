package ch.codebulb.crudfacesdemo.global;

import ch.codebulb.crudfacesdemo.crud.model.Customer;
import java.io.Serializable;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@ViewScoped
@Named
public class FocusController implements Serializable {
    private Customer entity = new Customer();
    
    public void clear() {
        entity = new Customer();
    }

    public Customer getEntity() {
        return entity;
    }

    public void setEntity(Customer entity) {
        this.entity = entity;
    }
}
