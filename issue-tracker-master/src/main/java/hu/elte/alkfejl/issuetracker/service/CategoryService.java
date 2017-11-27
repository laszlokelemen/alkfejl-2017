package hu.elte.alkfejl.issuetracker.service;

import hu.elte.alkfejl.issuetracker.model.Categories;
import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.model.Storage;
import hu.elte.alkfejl.issuetracker.model.User;
import hu.elte.alkfejl.issuetracker.repository.CategoryRepository;
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
public class CategoryService {

    @Autowired
    private CategoryRepository categoriesRepository;

    public Iterable<Categories> products() {
        return categoriesRepository.findAll();
    }


    public Categories create(Categories category) {
        if(categoriesRepository.findByName(category.getName()).isPresent()){
            //
        }
        return categoriesRepository.save(category);
    }
    
    public Categories update(Categories category) {
        return categoriesRepository.save(category);
    }


    public void delete(int id) {
        categoriesRepository.delete(id);
    }

    public Categories read(int id) {
        return categoriesRepository.findOne(id);
    }

   /* public void addMessage(int id, IssueMessage message) {
        Issue issue = issueRepository.findOne(id);
        message.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        issue.getMessages().add(message);
        issueRepository.save(issue);
    }*/
}