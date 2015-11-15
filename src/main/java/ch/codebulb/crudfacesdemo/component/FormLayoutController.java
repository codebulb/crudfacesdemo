package ch.codebulb.crudfacesdemo.component;

import ch.codebulb.crudfacesdemo.crud.model.Customer;
import java.io.Serializable;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@ViewScoped
@Named
public class FormLayoutController implements Serializable {
    private Customer entity = new Customer();

    public Customer getEntity() {
        return entity;
    }

    public void setEntity(Customer entity) {
        this.entity = entity;
    }
}
