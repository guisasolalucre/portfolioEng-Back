
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Experience;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucreciaguisasola.portfolio.repositories.ExperienceRepository;

@Service
public class ExperienceService implements IExperienceService{

    @Autowired
    ExperienceRepository expRepo;

    @Override
    public List<Experience> list() {
        return expRepo.findAll();
    }

    @Override
    public void create(Experience exp) {
        expRepo.save(exp);
    }

    @Override
    public void delete(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experience find(Long id) {
        return expRepo.findById(id).orElse(null);
    }   

}
