package pers.jin.ssm.beans.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pers.jin.ssm.service.EmployeeService;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/15 8:12
 */
@Controller
public class EmployeeHandler {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/getAllEmployees",method = RequestMethod.GET)
    public ModelAndView getAllHandler(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("employeeList");
        mv.addObject("employees", employeeService.getAll());
        return mv;
    }
}
