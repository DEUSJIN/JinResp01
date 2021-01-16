package pers.jin.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pers.jin.springmvc.beans.User;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/31 10:37
 */
@Controller
public class SpringMVCHandler {
    @RequestMapping(value = "/testPOJO")
    public String testPOJO(User user){
        System.out.println(user);
        return "success";
    }
    /**
     * GET
     * @return
     */
    @RequestMapping(value = "/order/{id}",method = RequestMethod.GET)
    public String testRestGet(@PathVariable("id") Integer id){
        System.out.println("REST ID");
        return "success";
    }
    /**
     * POST
     * @return
     */
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String testRestPost(){
        System.out.println("REST POST");
        return "success";
    }
    /**
     * DELETE
     * @return
     */
    @RequestMapping(value = "/order/{id}",method = RequestMethod.DELETE)
    public String testRestDELETE(@PathVariable("id")Integer id){
        System.out.println("REST DELETE");
        return "success";
    }
    /**
     * PUT
     * @return
     */
    @RequestMapping(value = "/order",method = RequestMethod.PUT)
    public String testRestPut(){
        System.out.println("REST PUT");
        return "success";
    }

    @RequestMapping("/hello")
    public String handleWorld(){
        System.out.println("hello world(Spring)!");
        return "success";
    }
}
