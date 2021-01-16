package pers.jin.springmvc.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pers.jin.springmvc.beans.Customer;
import pers.jin.springmvc.dao.BuildingDao;
import pers.jin.springmvc.dao.CustomerDao;
import pers.jin.springmvc.dao.CustomerDaoImpl;

import java.util.Collection;

/**
 * @Author: DEUSJIN
 * @Date: 2021/1/3 21:10
 */
@Controller
public class CrudHandler {
    @Autowired
    CustomerDao customerDao;
    @Autowired
    BuildingDao buildingDao;
    @RequestMapping(value = "/getCustomers")
    public ModelAndView getCustomersHandler(){
        Collection<Customer> customers = customerDao.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customers", customers);
        modelAndView.setViewName("list");
        return modelAndView;
    }
    @RequestMapping(value = "/addCustomer")
    public String addCustomerHandler(){
        Customer jerry = new Customer(1007, "123456", "Jerry", 1, 9000000.0);
        customerDao.save(jerry);
        return "success";
    }
}
