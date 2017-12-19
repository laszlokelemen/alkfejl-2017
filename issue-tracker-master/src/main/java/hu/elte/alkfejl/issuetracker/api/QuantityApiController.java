package hu.elte.alkfejl.issuetracker.api;

import hu.elte.alkfejl.issuetracker.model.Quantity;
import hu.elte.alkfejl.issuetracker.service.UserService;
import hu.elte.alkfejl.issuetracker.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static hu.elte.alkfejl.issuetracker.model.User.Role.ADMIN;
import static hu.elte.alkfejl.issuetracker.model.User.Role.USER;
import hu.elte.alkfejl.issuetracker.service.QuantityService;
import java.util.List;
import java.util.Optional;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@RestController
@RequestMapping("/api/quantity")
public class QuantityApiController {

    @Autowired
    private QuantityService quantityService;

    @Autowired
    private UserService userService;

    @Role({ADMIN, USER})
    @GetMapping
    private ResponseEntity<Iterable<Quantity>> list() {
        Iterable<Quantity> quantity = quantityService.findAll();
        return ResponseEntity.ok(quantity);
    }

    @Role({ADMIN, USER})
    @PostMapping
    private ResponseEntity<Quantity> create(@RequestBody Quantity quantity) {
        Quantity saved = quantityService.create(quantity);
        return ResponseEntity.ok(saved);
    }

    @Role({ADMIN, USER})
    @GetMapping("/{id}")
    private ResponseEntity<Quantity> read(@PathVariable String id) {
        Quantity read = quantityService.read(Integer.parseInt(id));
        return ResponseEntity.ok(read);
    }
    /*
    @Role({ADMIN, USER})
    @GetMapping("/{id}")
    private ResponseEntity<List<Quantity>> readByStorage(@PathVariable String id) {
        List<Quantity> read = quantityService.readByStorage(Integer.parseInt(id));
        return ResponseEntity.ok(read);
    }
    */
    
    @Role(ADMIN)
    @PutMapping("/{id}")
    private ResponseEntity<Quantity> update(@PathVariable int id, @RequestBody Quantity quantity) {
        Quantity updated = quantityService.update(id, quantity);
        return ResponseEntity.ok(updated);
    }

    @Role(ADMIN)
    @DeleteMapping("/{id}")
    private ResponseEntity delete(@PathVariable int id) {
        quantityService.delete(id);
        return ResponseEntity.ok().build();
    }
/*
    @Role({USER, ADMIN})
    @PostMapping("/{id}/message")
    private ResponseEntity addMessage(@PathVariable int id, @RequestBody IssueMessage message) {
        quantityService.addMessage(id, message);
        return ResponseEntity.ok().build();
    }*/
}