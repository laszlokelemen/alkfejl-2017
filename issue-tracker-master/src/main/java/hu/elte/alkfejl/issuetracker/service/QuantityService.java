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
import java.util.List;
import java.util.Optional;

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
        return quantityRepository.save(quantity);
    }
    
    public Quantity addComment(Quantity quantity, String comment) {
        quantity.comment(comment);
        return quantityRepository.save(quantity);
    }
    
    public Quantity update(int id, Quantity _quantity) {
        Quantity quantity = quantityRepository.findOne(id);
        quantity.setQuantity(_quantity.getQuantity());
        quantity.setComment(_quantity.getComment());
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
   /* 
    public List<Quantity> readByDepo(int id) {
        return quantityRepository.findOneByDepository_id(id);
    }
    
    public List<Quantity> readByStorage(int id) {
        return quantityRepository.findOneByDepository_id(id);
    }
*/
   /* public void addMessage(int id, IssueMessage message) {
        Issue issue = issueRepository.findOne(id);
        message.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        issue.getMessages().add(message);
        issueRepository.save(issue);
    }*/
}