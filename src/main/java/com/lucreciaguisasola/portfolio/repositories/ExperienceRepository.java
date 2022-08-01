
package com.lucreciaguisasola.portfolio.repositories;

import com.lucreciaguisasola.portfolio.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>  {

}
