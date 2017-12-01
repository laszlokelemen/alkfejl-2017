package hu.elte.alkfejl.issuetracker.service;

import hu.elte.alkfejl.issuetracker.model.Categories;
import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.repository.DepositoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Service
public class DepositoryService {

    @Autowired
    private DepositoryRepository depositoryRepository;

    public Iterable<Depository> findAll() {
        return depositoryRepository.findAll();
    }


    public Depository create(Depository depository) {
        if(depositoryRepository.findByAddress(depository.getAddress()).isPresent()){
            //
        }
        return depositoryRepository.save(depository);
    }
    
    public Depository update(Depository depository) {
        return depositoryRepository.save(depository);
    }


    public void delete(int id) {
        depositoryRepository.delete(id);
    }

    public Depository read(int id) {
        return depositoryRepository.findOne(id);
    }

   /* public void addMessage(int id, IssueMessage message) {
        Issue issue = issueRepository.findOne(id);
        message.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        issue.getMessages().add(message);
        issueRepository.save(issue);
    }*/
}