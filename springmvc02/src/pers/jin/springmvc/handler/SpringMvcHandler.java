package pers.jin.springmvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/2 16:23
 */
@Controller
public class SpringMvcHandler {
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","Admin");
        modelAndView.setViewName("success");
        System.out.println(modelAndView);
        return modelAndView;
    }
}
