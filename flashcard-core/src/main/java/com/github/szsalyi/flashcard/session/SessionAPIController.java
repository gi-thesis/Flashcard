package com.github.szsalyi.flashcard.session;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
        path = "/api/sessions",
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SessionAPIController {

    @Autowired
    private SessionService sessionService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<SessionVO> getOne(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK).body(sessionService.get(id));
    }

    @GetMapping()
    public ResponseEntity<List<SessionVO>> getAllByUserId(@RequestParam Long userId) {
        if(userId == null ){
            return ResponseEntity.status(HttpStatus.OK).body(sessionService.getAll());
        }
        return ResponseEntity.status(HttpStatus.OK).body(sessionService.findAllByUserId(userId));
    }




    @PostMapping
    public ResponseEntity<SessionVO> save(@RequestBody SessionVO session) {
        return ResponseEntity.status(HttpStatus.CREATED).body(sessionService.save(session));
    }

}
