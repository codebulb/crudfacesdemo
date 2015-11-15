package ch.codebulb.crudfacesdemo.crud.service;

import ch.codebulb.crudfaces.service.CrudService;
import ch.codebulb.crudfacesdemo.crud.model.Customer;
import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SessionScoped
public class CustomerService extends CrudService<Customer> {
    @Override
    @PersistenceContext
    protected void setEm(EntityManager em) {
        super.setEm(em);
    }
    
    @Override
    public Customer create() {
        return new Customer();
    }

    @Override
    public Class<Customer> getModelClass() {
        return Customer.class;
    }
}
