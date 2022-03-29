package fpt.fa.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import fpt.fa.entities.KhachHang;
import fpt.fa.service.KhachHangService;


@Component
public class KhachHangFormatter implements Formatter<KhachHang>{
	@Autowired
	private KhachHangService khachHangService;
	
	@Override
	public String print(KhachHang object, Locale locale) {
		// TODO Auto-generated method stub
		return object.toString();
	}

	@Override
	public KhachHang parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		return khachHangService.getKhachHangById(Integer.parseInt(text));
	}
	

}
