package hu.elte.alkfejl.issuetracker.api;

import hu.elte.alkfejl.issuetracker.model.Depository;
import hu.elte.alkfejl.issuetracker.service.UserService;
import hu.elte.alkfejl.issuetracker.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static hu.elte.alkfejl.issuetracker.model.User.Role.ADMIN;
import static hu.elte.alkfejl.issuetracker.model.User.Role.USER;
import hu.elte.alkfejl.issuetracker.service.DepositoryService;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@RestController
@RequestMapping("/api/depository")
public class DepositoryApiController {

    @Autowired
    private DepositoryService depositoryService;

    @Autowired
    private UserService userService;

    @Role({ADMIN, USER})
    @GetMapping
    private ResponseEntity<Iterable<Depository>> list() {
        Iterable<Depository> depository = depositoryService.findAll();
        return ResponseEntity.ok(depository);
    }

    @Role({ADMIN, USER})
    @PostMapping
    private ResponseEntity<Depository> create(@RequestBody Depository depository) {
        Depository saved = depositoryService.create(depository);
        return ResponseEntity.ok(saved);
    }

    @Role({ADMIN, USER})
    @GetMapping("/{id}")
    private ResponseEntity<Depository> read(@PathVariable String id) {
        Depository read = depositoryService.read(Integer.parseInt(id));
        return ResponseEntity.ok(read);
    }
    
    
/*  TODO
    @Role(ADMIN)
    @PutMapping("/{id}")
    private ResponseEntity<Depository> update(@PathVariable int id, @RequestBody Depository depository) {
        Depository updated = depositoryService.update(id, depository);
        return ResponseEntity.ok(updated);
    }*/

    @Role(ADMIN)
    @DeleteMapping("/{id}")
    private ResponseEntity delete(@PathVariable int id) {
        depositoryService.delete(id);
        return ResponseEntity.ok().build();
    }
/*
    @Role({USER, ADMIN})
    @PostMapping("/{id}/message")
    private ResponseEntity addMessage(@PathVariable int id, @RequestBody IssueMessage message) {
        depositoryService.addMessage(id, message);
        return ResponseEntity.ok().build();
    }*/
}