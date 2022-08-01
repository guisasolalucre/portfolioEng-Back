
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucreciaguisasola.portfolio.repositories.SkillRepository;

@Service
public class SkillService implements ISkillService {

    @Autowired
    SkillRepository skillRepo;

    @Override
    public List<Skill> list() {
        return skillRepo.findAll();
    }

    @Override
    public void create(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void delete(Long id) {
        skillRepo.deleteById(id);
    }

    @Override
    public Skill find(Long id) {
        return skillRepo.findById(id).orElse(null);
    }  

}
