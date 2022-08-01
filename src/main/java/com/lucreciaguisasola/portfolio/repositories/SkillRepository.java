
package com.lucreciaguisasola.portfolio.repositories;

import com.lucreciaguisasola.portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>  {

}
