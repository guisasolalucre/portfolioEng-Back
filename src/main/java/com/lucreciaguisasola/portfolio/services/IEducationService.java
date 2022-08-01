
package com.lucreciaguisasola.portfolio.services;

import com.lucreciaguisasola.portfolio.model.Education;
import java.util.List;

public interface IEducationService {

    public List<Education> list();
    
    public void create(Education edu);
    
    public void delete(Long id);
    
    public Education find(Long id);
    
}
