package ch.codebulb.crudfacesdemo.crud.model;

import ch.codebulb.crudfaces.model.CrudEntity;
import ch.codebulb.crudfaces.validation.constraints.MaxSize;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Pattern;

/**
 * An alternative {@link Customer} implementation with no properties marked as "required".
 */
@Entity
public class OptionalCustomer extends CrudEntity {
    @Pattern(regexp = "[^0-9]*", message = "{validation.model.customer.name}")
    private String firstName;
    @Pattern(regexp = "[^0-9]*", message = "{validation.model.customer.name}")
    private String lastName;
    @MaxSize(100)
    private String comment;
    private boolean premium;
    @Enumerated(EnumType.STRING)
    private Language mainLanguage;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public Language getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(Language mainLanguage) {
        this.mainLanguage = mainLanguage;
    }
}
