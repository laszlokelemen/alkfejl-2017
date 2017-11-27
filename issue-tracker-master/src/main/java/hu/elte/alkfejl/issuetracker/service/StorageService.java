package hu.elte.alkfejl.issuetracker.service;

import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.model.Storage;
import hu.elte.alkfejl.issuetracker.model.User;
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
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    public Iterable<Storage> products() {
        return storageRepository.findAll();
    }


    public Storage create(Storage product) {
        //category check
        
        return storageRepository.save(product);
    }
    
    public Storage update(Storage product) {
        return storageRepository.save(product);
    }


    public void delete(int id) {
        storageRepository.delete(id);
    }

    public Storage read(int id) {
        return storageRepository.findOne(id);
    }

   /* public void addMessage(int id, IssueMessage message) {
        Issue issue = issueRepository.findOne(id);
        message.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        issue.getMessages().add(message);
        issueRepository.save(issue);
    }*/
}