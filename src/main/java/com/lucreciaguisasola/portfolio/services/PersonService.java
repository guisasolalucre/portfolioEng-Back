package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucreciaguisasola.portfolio.repositories.PersonRepository;

@Service
public class PersonService implements IPersonService{

    @Autowired
    public PersonRepository personaRepo;

    @Override
    public List<Person> list() {
        return personaRepo.findAll();
    }

    @Override
    public void create(Person p) {
        personaRepo.save(p);
    }

    @Override
    public Person find(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        personaRepo.deleteById(id);
    }

}
