package uni2grow.exam.helloword.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uni2grow.exam.helloword.entiter.Client;
import uni2grow.exam.helloword.services.ClientService;

import java.util.List;

@RestController
@RequestMapping(path = "client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PatchMapping
    public void creer(@RequestBody Client client){

     this.clientService.creer(client);
    }
@GetMapping
    public List<Client> rechercher(){
       return this.clientService.rechercher();
    }
    @GetMapping(path = "{id}")
    public Client lire(@PathVariable int id){
      return this.clientService.lire(id);
    }


}
