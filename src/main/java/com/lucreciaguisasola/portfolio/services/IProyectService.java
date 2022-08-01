
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Proyect;
import java.util.List;

public interface IProyectService {

    public List<Proyect> list();
    
    public void create(Proyect proy);
    
    public void delete(Long id);
    
    public Proyect find(Long id);
    
}
