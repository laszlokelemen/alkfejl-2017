package hu.elte.alkfejl.issuetracker.api;

import hu.elte.alkfejl.issuetracker.model.Categories;
import hu.elte.alkfejl.issuetracker.service.UserService;
import hu.elte.alkfejl.issuetracker.service.annotations.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static hu.elte.alkfejl.issuetracker.model.User.Role.ADMIN;
import static hu.elte.alkfejl.issuetracker.model.User.Role.USER;
import hu.elte.alkfejl.issuetracker.service.CategoryService;

/**
 * @author Godzsák Dávid <godzsakdavid@gmail.com>
 */
@RestController
@RequestMapping("/api/category")
public class CategoryApiController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private UserService userService;

    @Role({ADMIN, USER})
    @GetMapping
    private ResponseEntity<Iterable<Categories>> list() {
        Iterable<Categories> category = categoryService.findAll();
        return ResponseEntity.ok(category);
    }

    @Role({ADMIN, USER})
    @PostMapping
    private ResponseEntity<Categories> create(@RequestBody Categories category) {
        Categories saved = categoryService.create(category);
        return ResponseEntity.ok(saved);
    }

    @Role({ADMIN, USER})
    @GetMapping("/{id}")
    private ResponseEntity<Categories> read(@PathVariable String id) {
        Categories read = categoryService.read(Integer.parseInt(id));
        return ResponseEntity.ok(read);
    }
    
    
/*  TODO
    @Role(ADMIN)
    @PutMapping("/{id}")
    private ResponseEntity<Category> update(@PathVariable int id, @RequestBody Category category) {
        Category updated = categoryService.update(id, category);
        return ResponseEntity.ok(updated);
    }*/

    @Role(ADMIN)
    @DeleteMapping("/{id}")
    private ResponseEntity delete(@PathVariable int id) {
        categoryService.delete(id);
        return ResponseEntity.ok().build();
    }
/*
    @Role({USER, ADMIN})
    @PostMapping("/{id}/message")
    private ResponseEntity addMessage(@PathVariable int id, @RequestBody IssueMessage message) {
        categoryService.addMessage(id, message);
        return ResponseEntity.ok().build();
    }*/
}