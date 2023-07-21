package uni2grow.exam.helloword.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uni2grow.exam.helloword.entiter.Sentiment;

public interface SentimentRepository extends JpaRepository<Sentiment, Integer> {
}
