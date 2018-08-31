package com.hospital.validators;

import com.hospital.models.Registration;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class RegistrationValidator implements Validator {
    public boolean supports(Class<?>aClass){
        return Registration.class.equals(aClass);

    }
    public  void validate(Object o,Errors errors) {
        Registration registration = (Registration)o;

        if (registration.firstName == null || registration.firstName.equals("")) {
            errors.rejectValue("firstName", "registration.firstName", "First Name is null");
        }
        if (registration.lastName == null || registration.lastName.equals("")) {
            errors.rejectValue("lastName", "registration.lastName", "last Name is null");
        }
        if (registration.lastName == null || registration.lastName.equals("")) {
            errors.rejectValue("userName", "registration.userName", "user" +
                    " Name is null");
        }
    }
    }



