
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Experience;
import java.util.List;

public interface IExperienceService {

    public List<Experience> list();
    
    public void create(Experience exp);
    
    public void delete(Long id);
    
    public Experience find(Long id);
    
}
