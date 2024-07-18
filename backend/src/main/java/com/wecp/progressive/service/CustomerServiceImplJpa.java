package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.repository.CustomerRepository;

@Service
public class CustomerServiceImplJpa implements CustomerService{

//@Autowired
private final CustomerRepository customerRepository;

@Autowired
public CustomerServiceImplJpa(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
}

@Override
public List<Customers> getAllCustomers() throws SQLException {
    // TODO Auto-generated method stub

    return customerRepository.findAll();
    
 //   throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
}

@Override
public Customers getCustomerById(int customerId) throws SQLException {
    // TODO Auto-generated method stub
  
   return  customerRepository.findById(customerId).get();
   
    //throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
}

@Override
public int addCustomer(Customers customers) throws SQLException {
    customerRepository.save(customers);
   
        return customers.getCustomerId();
 
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
}

@Override
public void updateCustomer( Customers customers) throws SQLException {
    // TODO Auto-generated method stub

    customerRepository.save(customers);
  //  throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
}

@Override
public void deleteCustomer(int customerId) throws SQLException {
    // TODO Auto-generated method stub
    customerRepository.deleteById(customerId);
   // throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
}

// @Override
// public List<Customers> getAllCustomersSortedByName() throws SQLException {
//     // TODO Auto-generated method stub
//     return customerRepository.getAllCustomersSortedByName();
 //   throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");


 List<Customers> al = new ArrayList<>();

@Override
public List<Customers> getAllCustomersFromArrayList() {
    // TODO Auto-generated method stub
 //   return customerRepository.findAll();
    return al;
 // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
}

@Override
public List<Customers> addCustomersToArrayList(Customers customers) {
    // TODO Auto-generated method stub
    al.add(customers);
    return al;
    
   // throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
}

@Override
public List<Customers> getAllCustomersSortedByNameFromArrayList() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
}

@Override
public void emptyArrayList() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
}

@Override
public List<Customers> getAllCustomersSortedByName() throws SQLException {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
}


    


}