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
import java.util.Optional;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@Service
public class StorageService {

    @Autowired
    private StorageRepository storageRepository;

    private Storage storage;
    
    public Iterable<Storage> findAll() {
        return storageRepository.findAll();
    }


    public Storage create(Storage product) {
        //category check
        return storageRepository.save(product);
        
    }
    
    public Optional<Storage> findById(int id) {
        return Optional.of(storageRepository.findOne(id));
    }
    
    public Storage update(int id, Storage product) {
        //id filter?
        Storage storage = storageRepository.findOne(id);
        storage.setColor(product.getColor());
        storage.setName(product.getName());
        storage.setPrice(product.getPrice());
        storage.setSize(product.getSize());
        return storageRepository.save(storage);
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