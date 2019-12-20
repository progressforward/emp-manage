package com.example.empmanage.controller;

import com.example.empmanage.entity.Person;
import com.example.empmanage.service.PersonService;
import com.example.empmanage.utils.EmpResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    public final static Logger logger = LoggerFactory.getLogger(EmpController.class);

    @Resource
    PersonService personService;

    //根据id获取员工信息
    @RequestMapping(path = "/emps/{id}", method= RequestMethod.GET)
    public EmpResult<Person> getById(@PathVariable int id){
        logger.info("获取一个员工数据！");
        Person person = personService.getById(id);
        boolean result = person!=null;
        return new EmpResult<>(result ? "success" : "error", person, result ? "获取数据成功" : "获取数据失败");
    }

    //获取所有员工信息
    @RequestMapping(path="/emps", method=RequestMethod.GET)
    public EmpResult<List<Person>> getAll() {
        logger.info("获取所有数据！");
        //logger.debug("debug level");
        //logger.warn("warn level");
        //logger.error("erro level");
        List<Person> persons = personService.getAll();
        boolean result = persons!=null;
        return new EmpResult<>(result ? "success" : "error", persons, result ? "获取数据成功" : "获取数据失败");
    }

    //根据id删除一个员工
    @RequestMapping(path="/emps/{id}", method = RequestMethod.DELETE)
    public EmpResult<Person> delete(@PathVariable int id) {
        logger.info("删除一个员工数据！");
        Person person = personService.getById(id);
        int re = personService.delete(id);
        boolean result = re==1;  //re为1，则表示删除成功
        return new EmpResult<>(result ? "success" : "error", person, result ? "删除数据成功" : "删除数据失败");
    }

    //修改一个员工，传递参数为一个Person
    @RequestMapping(path = "/emps", method = RequestMethod.PUT)
    public EmpResult<Person> update(@RequestBody Person person) {
        logger.info("修改一个员工数据！");
        int re = personService.update(person);
        boolean result = re == 1;
        return new EmpResult<>(result ? "success" : "error", person, result ? "修改数据成功" : "修改数据失败");
    }

    //增加一个员工
    @RequestMapping(value = "/emps", method = RequestMethod.POST)
    public EmpResult<Person> save(@RequestBody Person person){
        logger.info("增加一个员工数据！");
        int re = personService.save(person);
        boolean result = re == 1;
        return new EmpResult<>(result ? "success" : "error", person, result ? "增加数据成功" : "增加数据失败");
    }
}
