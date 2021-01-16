package pers.jin.spring.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pers.jin.spring.beans.Department;
import pers.jin.spring.beans.Employee;
import pers.jin.spring.dao.EmployeeDao;

import java.lang.reflect.GenericDeclaration;
import java.util.*;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/7 19:51
 */
@Controller
public class SpringMvcHandler {
    @Autowired
    EmployeeDao employeeDao;

    @ResponseBody
    @RequestMapping("/testJson")
    public Collection<Employee> testJson(){
        return employeeDao.getAll();
    }
    @RequestMapping(value = "/toEmployeeList",method = RequestMethod.GET)
    public ModelAndView toEmployeeListHandler(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("employees");
        Collection<Employee> employees = employeeDao.getAll();
        mv.addObject("employees", employees);
        return mv;
    }
    @RequestMapping(value = "/toAddEmployee",method = RequestMethod.GET)
    public ModelAndView toAddEmployeePage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addEmployee");
        //部门集合
        List<Department> departs = new ArrayList<>();
        departs.add(new Department(1001,"宇宙"));
        departs.add(new Department(1002,"地球"));
        departs.add(new Department(1003,"M78"));
        departs.add(new Department(1004,"漫威"));
        departs.add(new Department(1004,"DC"));
        mv.addObject("departs", departs);
        //男女列表
        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("0","女");
        genderMap.put("1","男");
        mv.addObject("genderMap",genderMap);
        //command
        mv.addObject("command", new Employee());
        return mv;
    }
    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    public String addEmployeeHandler(Employee employee){
        if(employeeDao.get(employee.getId())==null){
            employeeDao.save(employee);
        }
        return "redirect:/toEmployeeList";
    }
    @RequestMapping(value = "/deleteEmployee/{employeeId}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("employeeId") Integer employeeId){
        employeeDao.delete(employeeId);
        return "redirect:/toEmployeeList";
    }
    @RequestMapping(value = "/toEditEmployee/{employeeId}",method = RequestMethod.GET)
    public ModelAndView toEditEmployeeHandler(@PathVariable("employeeId")Integer employeeId){
        Employee employee = employeeDao.get(employeeId);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addEmployee");
        mv.addObject("employee", employee);
        //部门集合
        List<Department> departs = new ArrayList<>();
        departs.add(new Department(1001,"宇宙"));
        departs.add(new Department(1002,"地球"));
        departs.add(new Department(1003,"M78"));
        departs.add(new Department(1004,"漫威"));
        departs.add(new Department(1004,"DC"));
        mv.addObject("departs", departs);
        //男女列表
        Map<String, String> genderMap = new HashMap<>();
        genderMap.put("0","女");
        genderMap.put("1","男");
        mv.addObject("genderMap",genderMap);
        mv.addObject("command", employee);
        return mv;
    }
    @RequestMapping(value = "/addEmployee",method = RequestMethod.PUT)
    public String editEmployeeHandler(Employee employee){
        employeeDao.update(employee.getId(), employee);
        return "redirect:/toEmployeeList";
    }
}
