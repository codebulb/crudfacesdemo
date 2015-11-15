package ch.codebulb.crudfacesdemo.crud.model;

import ch.codebulb.crudfaces.model.CrudEntity;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Customer extends CrudEntity {
    @NotNull
    @Pattern(regexp = "[^0-9]*", message = "{validation.model.customer.name}")
    private String firstName;
    @NotNull
    @Pattern(regexp = "[^0-9]*", message = "{validation.model.customer.name}")
    private String lastName;
    
    public String getInitials() {
        return String.valueOf(firstName.charAt(0)) + String.valueOf(lastName.charAt(0));
    }

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
}
