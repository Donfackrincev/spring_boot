package uni2grow.exam.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //qui est la porte D'entrer un API le rest est une nome qui indique comme ecrire c'es chemin
@RequestMapping(path = "test" )
public class TestController {

    @GetMapping(path = "string")
    public String getString(){
        return "chaine de caractere transmise par SA";
    }


}
