package com.github.szsalyi.flashcard.categories;

import com.github.szsalyi.flashcard.exception.ResourceNotFoundException;
import com.github.szsalyi.flashcard.exception.SaveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
    path = "/api/categories",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CategoryAPIController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryVO> create(@RequestBody final CategoryVO category) throws SaveException {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(categoryService.save(category));
    }


    @GetMapping(path = "/all", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<List<CategoryVO>> getAll() {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(categoryService.getAllCategory());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CategoryVO> get(@PathVariable final long id) throws ResourceNotFoundException {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(categoryService.getCategory(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable final long id) throws ResourceNotFoundException {
        categoryService.deleteCategory(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping (consumes = MediaType.ALL_VALUE)
    public ResponseEntity<List<CategoryVO>> getCategoriesByUser(@RequestParam final String username) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(categoryService.getAllCategoriesByUsername(username));
    }

    @DeleteMapping(path = "/delete", consumes = MediaType.ALL_VALUE)
    public ResponseEntity deleteCategory(@RequestParam final long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
}
