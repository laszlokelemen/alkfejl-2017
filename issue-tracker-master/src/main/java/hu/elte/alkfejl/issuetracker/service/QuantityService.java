package hu.elte.alkfejl.issuetracker.service;

import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.model.Quantity;
import hu.elte.alkfejl.issuetracker.model.Storage;
import hu.elte.alkfejl.issuetracker.model.User;
import hu.elte.alkfejl.issuetracker.repository.QuantityRepository;
import hu.elte.alkfejl.issuetracker.repository.StorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Service
public class QuantityService {

    @Autowired
    private QuantityRepository quantityRepository;

    public Iterable<Quantity> findAll() {
        return quantityRepository.findAll();
    }


    public Quantity create(Quantity quantity) {
        //category check
        
        return quantityRepository.save(quantity);
    }
    
    public Quantity update(Quantity quantity) {
        return quantityRepository.save(quantity);
    }


    public Quantity add(Quantity quantity,int number){
        quantity.renewal(number);
        return quantityRepository.save(quantity);
    }
    
    public Quantity subtract(Quantity quantity,int number){
        quantity.sold(number);
        return quantityRepository.save(quantity);
    }
    
    public void delete(int id) {
        quantityRepository.delete(id);
    }

    public Quantity read(int id) {
        return quantityRepository.findOne(id);
    }

   /* public void addMessage(int id, IssueMessage message) {
        Issue issue = issueRepository.findOne(id);
        message.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        issue.getMessages().add(message);
        issueRepository.save(issue);
    }*/
}