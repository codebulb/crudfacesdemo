package ch.codebulb.crudfacesdemo.validators;

import ch.codebulb.crudfaces.validation.constraints.MaxSize;
import java.io.Serializable;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

@ViewScoped
@Named
public class ValidatorController implements Serializable {
    @MaxSize(10)
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
