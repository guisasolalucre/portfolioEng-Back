
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Proyect;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lucreciaguisasola.portfolio.repositories.ProyectRepository;

@Service
public class ProyectService implements IProyectService {

    @Autowired
    ProyectRepository proyRepo;

    @Override
    public List<Proyect> list() {
        return proyRepo.findAll();
    }

    @Override
    public void create(Proyect proy) {
        proyRepo.save(proy);
    }

    @Override
    public void delete(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyect find(Long id) {
        return proyRepo.findById(id).orElse(null);
    }  


}
