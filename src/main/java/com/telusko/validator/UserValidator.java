package com.telusko.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.telusko.forms.*;

@Component
public class UserValidator implements Validator {

  @Override
  public boolean supports(Class<?> clazz) {
    return User.class.equals(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required");

    User user = (User) target;

    if (user.getPassword().length() < 6) {
      errors.rejectValue("password", "password.too.short");
    }
  }
}
