package uni2grow.exam.helloword.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni2grow.exam.helloword.entiter.Client;
import uni2grow.exam.helloword.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

   private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public  void creer(Client client) {
        Client clientDansLaBDD = this.clientRepository.findAllByEmail(client.getEmail());
        if (clientDansLaBDD == null) {
            this.clientRepository.save(client);

        }
    }
    public List<Client> rechercher(){
        return this.clientRepository.findAll();
    }

    public Client lire(int id) {
        Optional<Client> optionalClient = this.clientRepository.findById(id);
        return optionalClient.orElse(null);
    }
}

