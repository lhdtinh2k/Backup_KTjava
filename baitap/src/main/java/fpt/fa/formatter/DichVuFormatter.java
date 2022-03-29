package fpt.fa.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import fpt.fa.entities.DichVu;
import fpt.fa.service.DichVuService;

@Component
public class DichVuFormatter implements Formatter<DichVu>{
	@Autowired
	private DichVuService dichvuService;
	
	@Override
	public String print(DichVu object, Locale locale) {
		// TODO Auto-generated method stub
		return object.toString();
	}

	@Override
	public DichVu parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		return dichvuService.getDichVuById(Integer.parseInt(text));
	}
	

}
