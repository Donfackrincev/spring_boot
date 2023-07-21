package uni2grow.exam.helloword.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uni2grow.exam.helloword.entiter.Client;

public interface  ClientRepository extends JpaRepository <Client, Integer>{
Client findAllByEmail(String email);
}
