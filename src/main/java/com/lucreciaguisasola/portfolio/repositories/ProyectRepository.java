
package com.lucreciaguisasola.portfolio.repositories;

import com.lucreciaguisasola.portfolio.model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends JpaRepository<Proyect, Long>  {

}
