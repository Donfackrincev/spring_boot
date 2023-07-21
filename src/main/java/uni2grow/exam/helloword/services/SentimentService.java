package uni2grow.exam.helloword.services;

import org.springframework.stereotype.Service;
import uni2grow.exam.helloword.entiter.Sentiment;
import uni2grow.exam.helloword.repository.SentimentRepository;

@Service
public class SentimentService {
private SentimentRepository sentimentRepository;

    public SentimentService(SentimentRepository sentimentRepository) {
        this.sentimentRepository = sentimentRepository;
    }

    public void creer(Sentiment sentiment){
    this.sentimentRepository.save(sentiment);
    }
}
