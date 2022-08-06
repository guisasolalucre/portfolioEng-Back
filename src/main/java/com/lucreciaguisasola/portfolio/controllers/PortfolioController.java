package com.lucreciaguisasola.portfolio.controllers;

import com.lucreciaguisasola.portfolio.model.Education;
import com.lucreciaguisasola.portfolio.model.Experience;
import com.lucreciaguisasola.portfolio.model.Skill;
import com.lucreciaguisasola.portfolio.model.Person;
import com.lucreciaguisasola.portfolio.model.Proyect;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lucreciaguisasola.portfolio.services.IEducationService;
import com.lucreciaguisasola.portfolio.services.IExperienceService;
import com.lucreciaguisasola.portfolio.services.ISkillService;
import com.lucreciaguisasola.portfolio.services.IPersonService;
import com.lucreciaguisasola.portfolio.services.IProyectService;

@RestController
public class PortfolioController {
    
    //******************************************************************
    // PERSON
    @Autowired
    private IPersonService personServ;
    
    @GetMapping("/data")
    public Person person() throws Exception {
        long id = 1;
        return personServ.find(id);
    }
    
    @PostMapping("/newPerson")
    public void newPerson(@RequestBody Person person){
        personServ.create(person);
    }
    
    @DeleteMapping("/deletePerson/{id}")
    public void deletePerson(@PathVariable Long id){
        personServ.delete(id);
    }
    
    @PutMapping("/editPerson/{id}")
    public void editPerson(@PathVariable Long id,
                              @RequestBody Person personFinal){
        Person personEdit = personServ.find(id);
        personEdit.setPhoto(personFinal.getPhoto());
        personEdit.setBanner(personFinal.getBanner());
        personEdit.setAbout(personFinal.getAbout());
        personEdit.setOcupation(personFinal.getOcupation());
        personEdit.setGithub(personFinal.getGithub());
        personEdit.setLinkedin(personFinal.getLinkedin());
        personEdit.setWhatsapp(personFinal.getWhatsapp());
        personEdit.setEmail(personFinal.getEmail());
        
        personServ.create(personFinal);
    }
    
    
    //******************************************************************
    // EDUCATION
    @Autowired
    private IEducationService eduServ;
    
    @PostMapping("/newEducation")
    public void newEducation(@RequestBody Education edu){
        eduServ.create(edu);
    }
    
    @GetMapping("/listEducation")
    public List<Education> listEducation(){
        return eduServ.list();
    }
    
    @DeleteMapping("/deleteEducation/{id}")
    public void deleteEducation(@PathVariable Long id){
        eduServ.delete(id);
    }
    
    @PutMapping("/editEducation/{id}")
    public void editEducation(@PathVariable Long id,
                              @RequestBody Education eduFinal){
        Education eduEdit = eduServ.find(id);
        eduEdit.setCareer(eduFinal.getCareer());
        eduEdit.setInstitution(eduFinal.getInstitution());
        eduEdit.setUbication(eduFinal.getUbication());
        eduEdit.setStart(eduFinal.getStart());
        eduEdit.setFinish(eduFinal.getFinish());
        
        eduServ.create(eduEdit);
    }

    
    //******************************************************************
    // EXPERIENCE
    @Autowired
    private IExperienceService expServ;
    
    @PostMapping("/newExperience")
    public void newExperience(@RequestBody Experience exp){
        expServ.create(exp);
    }
    
    @GetMapping("/listExperience")
    public List<Experience> listExperience(){
        return expServ.list();
    }
    
    @DeleteMapping("/deleteExperience/{id}")
    public void deleteExperience(@PathVariable Long id){
        expServ.delete(id);
    }
    
    @PutMapping("/editExperience/{id}")
    public void editExperience(@PathVariable Long id,
                              @RequestBody Experience expFinal){
        Experience expEdit = expServ.find(id);
        expEdit.setJob(expFinal.getJob());
        expEdit.setCompany(expFinal.getCompany());
        expEdit.setStart(expFinal.getStart());
        expEdit.setFinish(expFinal.getFinish());
        expEdit.setUbication(expFinal.getUbication());
        expEdit.setDescription(expFinal.getDescription());
        
        expServ.create(expEdit);
    }

    
    //******************************************************************
    //SKILL
    @Autowired
    private ISkillService skillServ;
    
    @PostMapping("/newSkill")
    public void newSkill(@RequestBody Skill skill){
        skillServ.create(skill);
    }
    
    @GetMapping("/listSkills")
    public List<Skill> listSkills(){
        return skillServ.list();
    }
    
    @DeleteMapping("/deleteSkill/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillServ.delete(id);
    }
    
    @PutMapping("/editSkill/{id}")
    public void editSkill(@PathVariable Long id,
                              @RequestBody Skill skillFinal){
        Skill skillEdit = skillServ.find(id);
        skillEdit.setName(skillFinal.getName());
        skillEdit.setPercent(skillFinal.getPercent());
        
        skillServ.create(skillFinal);
    }

    
    //******************************************************************
    // PROYECT
    @Autowired
    private IProyectService proyServ;
    
    @PostMapping("/newProyect")
    public void newProyect(@RequestBody Proyect proy){
        proyServ.create(proy);
    }
    
    @GetMapping("/listProyects")
    public List<Proyect> listProyects(){
        return proyServ.list();
    }
    
    @DeleteMapping("/deleteProyect/{id}")
    public void deleteProyect(@PathVariable Long id){
        proyServ.delete(id);
    }
    
    @PutMapping("/editProyect/{id}")
    public void editProyect(@PathVariable Long id,
                              @RequestBody Proyect proyFinal){
        Proyect proyEdit = proyServ.find(id);
        proyEdit.setName(proyFinal.getName());
        proyEdit.setUrl(proyFinal.getUrl());
        proyEdit.setDescription(proyFinal.getDescription());
        proyEdit.setStart(proyFinal.getStart());
        proyEdit.setFinish(proyFinal.getFinish());
        
        proyServ.create(proyFinal);
    }

}
