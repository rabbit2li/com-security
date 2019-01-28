package com.hg.validator;

import com.hg.service.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @auther kim
 * @date 2019/1/25
 */
public class MyContraintValidator implements ConstraintValidator<MyConstraint, Object> {

    @Autowired
    private ServiceTest test;

    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("validator init...");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        test.hello("jack");
        System.out.println(value);
        return false;
    }
}
