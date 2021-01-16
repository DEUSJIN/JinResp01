package pers.jin.ssm.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pers.jin.ssm.beans.Employee;
import pers.jin.ssm.service.EmployeeService;

import java.util.List;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/13 11:04
 */
@Controller
public class EmployeeHandler {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public ModelAndView listAllEmps(){
        List<Employee> emps = employeeService.getAllEmps();
        ModelAndView mv = new ModelAndView();
        mv.addObject("emps", emps);
        mv.setViewName("emps");
        return mv;
    }
}
