
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Person;
import java.util.List;

public interface IPersonService {
    
    public List<Person> list();
    
    public void create(Person p);
    
    public Person find(Long id);
    
    public void delete(Long id);

}
