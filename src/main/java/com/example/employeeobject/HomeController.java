package com.example.employeeobject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.WebParam;

@Controller
public class HomeController {

    @GetMapping("/employeeobjectform")
    public String loadform(Model model){
        model.addAttribute("employeeobject", new EmployeeObject());
        return "employeeobjectform";
    }

    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute EmployeeObject employeeObject, Model model){
        model.addAttribute("employeeobject", employeeObject);
        return "confirmemployeeobject";
    }
}
