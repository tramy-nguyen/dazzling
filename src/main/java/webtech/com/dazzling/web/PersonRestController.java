package webtech.com.dazzling.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import webtech.com.dazzling.api.Person;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonRestController {

    private List<Person> persons;

    public PersonRestController() {
        persons = new ArrayList<>();
        persons.add(new Person(1, "Max", "Mustermann", 20, true));
        persons.add(new Person(2, "Emma", "Mustermann", 20, false));
    }

    @GetMapping(path = "/api/v1/persons")
    public ResponseEntity<List <Person>> fetchPersons() {
        return ResponseEntity.ok(persons);
    }





}
