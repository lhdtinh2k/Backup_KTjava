package fpt.fa.validated;


import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import fpt.fa.entities.DichVu;


public class DichVuValidated implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		DichVu dichvu = (DichVu) target;
	}

}
