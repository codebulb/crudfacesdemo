package ch.codebulb.crudfacesdemo.crud.controller;

import ch.codebulb.crudfaces.controller.CrudTableController;
import ch.codebulb.crudfaces.service.CrudService;
import ch.codebulb.crudfacesdemo.crud.model.Customer;
import ch.codebulb.crudfacesdemo.crud.service.CustomerService;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named
public class CustomerController extends CrudTableController<Customer> {
    @Inject
    private CustomerService service;
    
    @Override
    protected CrudService<Customer> getService() {
        return service;
    }
}
