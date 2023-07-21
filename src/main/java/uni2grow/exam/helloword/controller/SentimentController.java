package uni2grow.exam.helloword.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uni2grow.exam.helloword.entiter.Sentiment;
import uni2grow.exam.helloword.services.SentimentService;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "sentiment", produces = APPLICATION_JSON_VALUE)
public class SentimentController {
private SentimentService sentimentService;

    public SentimentController(SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }
@ResponseStatus(HttpStatus.CREATED)
    @PatchMapping(consumes = APPLICATION_JSON_VALUE)
    public void creer(@RequestBody Sentiment sentiment){
    this.sentimentService.creer(sentiment);
    }
}
