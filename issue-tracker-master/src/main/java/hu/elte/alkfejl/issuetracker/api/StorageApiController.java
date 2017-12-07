package hu.elte.alkfejl.issuetracker.api;

import hu.elte.alkfejl.issuetracker.model.Storage;
import hu.elte.alkfejl.issuetracker.service.UserService;
import hu.elte.alkfejl.issuetracker.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static hu.elte.alkfejl.issuetracker.model.User.Role.ADMIN;
import static hu.elte.alkfejl.issuetracker.model.User.Role.USER;
import hu.elte.alkfejl.issuetracker.service.StorageService;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@RestController
@RequestMapping("/api/storage")
public class StorageApiController {

    @Autowired
    private StorageService stoageService;

    @Autowired
    private UserService userService;

    @Role({ADMIN, USER})
    @GetMapping
    private ResponseEntity<Iterable<Storage>> list() {
        Iterable<Storage> storage = stoageService.findAll();
        return ResponseEntity.ok(storage);
    }

  //  @Role({ADMIN, USER})
    @PostMapping
    private ResponseEntity<Storage> create(@RequestBody Storage storage) {
        Storage saved = stoageService.create(storage);
        return ResponseEntity.ok(saved);
    }

    @Role({ADMIN, USER})
    @GetMapping("/{id}")
    private ResponseEntity<Storage> read(@PathVariable String id) {
        Storage read = stoageService.read(Integer.parseInt(id));
        return ResponseEntity.ok(read);
    }

    @Role(ADMIN)
    @PutMapping("/{id}")
    private ResponseEntity<Storage> update(@PathVariable int id, @RequestBody Storage storage) {
        Storage updated = stoageService.update(id, storage);
        return ResponseEntity.ok(updated);
    }

    @Role(ADMIN)
    @DeleteMapping("/{id}")
    private ResponseEntity delete(@PathVariable int id) {
        stoageService.delete(id);
        return ResponseEntity.ok().build();
    }
/*
    @Role({USER, ADMIN})
    @PostMapping("/{id}/message")
    private ResponseEntity addMessage(@PathVariable int id, @RequestBody IssueMessage message) {
        stoageService.addMessage(id, message);
        return ResponseEntity.ok().build();
    }*/
}