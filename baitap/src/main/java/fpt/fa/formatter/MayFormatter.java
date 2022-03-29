package fpt.fa.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import fpt.fa.entities.May;
import fpt.fa.service.MayService;

@Component
public class MayFormatter implements Formatter<May>{
	@Autowired
	private MayService mayService;
	
	@Override
	public String print(May object, Locale locale) {
		// TODO Auto-generated method stub
		return object.toString();
	}

	@Override
	public May parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		return mayService.getMayById(Integer.parseInt(text));
	}
	

}
