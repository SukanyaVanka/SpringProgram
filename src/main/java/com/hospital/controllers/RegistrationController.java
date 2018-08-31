package com.hospital.controllers;

import com.hospital.models.Registration;
import com.hospital.services.RegistrationService;
import com.hospital.validators.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "/registartion")
    public String viewRegistration(Model model)throws Exception {
//            if (1 == 1) {
//                throw new Exception("null");
//            }
        System.out.println("hello ");
        model.addAttribute("registration",new Registration());

        return "registration";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@Validated @ModelAttribute("registration") Registration registration,BindingResult errors) {
        if (errors.hasErrors()) {
            System.out.println("errors");
            ModelAndView modelAndView = new ModelAndView();

            modelAndView.setViewName("registration");
            return modelAndView;
        }
        registrationService.registerUser(registration);
        return new ModelAndView("home");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.addValidators(new RegistrationValidator());
    }
    @ExceptionHandler(value = NullPointerException.class)//Controller level
    public String exception(){
        return "error";
    }

}

