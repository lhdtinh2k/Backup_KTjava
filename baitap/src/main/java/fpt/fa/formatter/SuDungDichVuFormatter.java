package fpt.fa.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import fpt.fa.entities.SuDungDichVu;
import fpt.fa.service.SuDungDichVuService;

@Component
public class SuDungDichVuFormatter implements Formatter<SuDungDichVu>{
	@Autowired
	private SuDungDichVuService dichvuService;
	
	@Override
	public String print(SuDungDichVu object, Locale locale) {
		// TODO Auto-generated method stub
		return object.toString();
	}

	@Override
	public SuDungDichVu parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		return dichvuService.getSuDungDichVuById(Integer.parseInt(text));
	}
	

}
