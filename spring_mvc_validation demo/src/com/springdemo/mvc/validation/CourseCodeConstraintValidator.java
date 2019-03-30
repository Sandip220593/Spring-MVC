package com.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode)
	{
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theData, ConstraintValidatorContext theConstraintValidatoecontext) {
		boolean result = false;
		
		if(theData!=null)
		{
			result = theData.startsWith(coursePrefix);
		}
		
		return result;
	}
	
}
