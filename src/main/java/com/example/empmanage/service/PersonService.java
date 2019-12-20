package com.example.empmanage.service;

import com.example.empmanage.dao.PersonDao;
import com.example.empmanage.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonDao personDao;

    public int save(Person person){ return personDao.save(person);}
    public Person getById(int id) { return personDao.getById(id); }
    //public int save(Person person) { return personDao.getById(); }
    public List<Person> getAll() {return personDao.getAll();}
    public int delete(int id) {return personDao.deleteEmp(id);}
    public int update( Person person) { return personDao.updateEmp(person);}
}
