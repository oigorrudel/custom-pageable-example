package br.xksoberbado.custompageableexample.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public Page<Person> get(Pageable pageable) {
        return personRepository.findAll(pageable);
    }
}
