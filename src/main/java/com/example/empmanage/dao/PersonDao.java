package com.example.empmanage.dao;

import com.example.empmanage.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
@Mapper
public interface PersonDao {
    public int save(Person person);
    public List<Person> getAll();
    Person getById( int id );
    int deleteEmp( int id);
    int updateEmp( Person person);
}
