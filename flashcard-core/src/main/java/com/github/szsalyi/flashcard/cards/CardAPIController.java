package com.github.szsalyi.flashcard.cards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
        path = "/api/cards",
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CardAPIController {

    @Autowired
    private CardService cardService;

    @PostMapping
    public ResponseEntity<CardVO> save(@RequestBody final CardVO cardVO) {
        CardVO card = cardService.save(cardVO);
        return  ResponseEntity
            .status(HttpStatus.OK)
            .body(card);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CardVO> getCard(@PathVariable final long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(cardService.getCard(id));
    }

    /*
    @GetMapping
    public ResponseEntity<List<CardVO>> getCards() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(cardService.getAllCards());
    }*/

    @GetMapping(consumes = MediaType.ALL_VALUE)
    public ResponseEntity<List<CardVO>> getCardsByCategory(@RequestParam final long categoryId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(cardService.findCardsByCategoryId(categoryId));
    }
}
