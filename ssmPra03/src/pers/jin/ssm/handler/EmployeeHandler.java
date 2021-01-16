package pers.jin.ssm.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pers.jin.ssm.service.EmployeeService;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/16 21:07
 */
@Controller
public class EmployeeHandler {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public ModelAndView getEmps(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        mv.addObject("emps", employeeService.getAll());
        return mv;
    }
}
