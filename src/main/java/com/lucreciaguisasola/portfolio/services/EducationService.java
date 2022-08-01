package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Education;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucreciaguisasola.portfolio.repositories.EducationRepository;

@Service
public class EducationService implements IEducationService {

    @Autowired
    EducationRepository eduRepo;

    @Override
    public List<Education> list() {
        return eduRepo.findAll();
    }

    @Override
    public void create(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void delete(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Education find(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
