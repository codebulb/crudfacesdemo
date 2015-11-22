package ch.codebulb.crudfacesdemo.validators;

import ch.codebulb.crudfaces.validation.constraints.MaxSize;
import java.io.Serializable;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@ViewScoped
@Named
public class ValidatorController implements Serializable {
    @MaxSize(10)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
