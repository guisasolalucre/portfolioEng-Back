
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Skill;
import java.util.List;

public interface ISkillService {

    public List<Skill> list();
    
    public void create(Skill skill);
    
    public void delete(Long id);
    
    public Skill find(Long id);
    
}
