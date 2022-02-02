package br.xksoberbado.custompageableexample;

import br.xksoberbado.custompageableexample.ex.Person;
import br.xksoberbado.custompageableexample.ex.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CustomPageableExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomPageableExampleApplication.class, args);
    }

    @Autowired
    private PersonRepository personRepository;

    @Component
    public class Mock implements ApplicationRunner {

        @Override
        public void run(ApplicationArguments args) throws Exception {
            personRepository.save(new Person("João", 10));
            personRepository.save(new Person("Maria", 15));
            personRepository.save(new Person("Pedro", 20));

            personRepository.save(new Person("Joana", 22));
            personRepository.save(new Person("Marcos", 35));
            personRepository.save(new Person("Igor", 28));

            personRepository.save(new Person("Eduardo", 8));
            personRepository.save(new Person("Adão", 53));
            personRepository.save(new Person("Eva", 67));
        }
    }

}
