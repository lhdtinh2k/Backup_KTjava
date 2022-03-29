package fpt.fa.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fpt.fa.entities.DichVu;
import fpt.fa.entities.Student;
import fpt.fa.entities.SuDungDichVu;
import fpt.fa.form.DangKyKhoaHocForm;
import fpt.fa.form.DangKySuDungDichVuForm;
import fpt.fa.service.DichVuService;
import fpt.fa.service.KhachHangService;
import fpt.fa.service.SuDungDichVuService;


@Controller
@RequestMapping(value = "/sudungdichvu")		//tenfolder
public class SuDungDichVuController {
	@Autowired
	SuDungDichVuService sudungdichvuService;
	@Autowired
	DichVuService dichVuService;
	@Autowired
	KhachHangService khachHangService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)	//ten link address
	public String list(Model model) {
		List<SuDungDichVu> suDungDichVus = sudungdichvuService.getList();	
		model.addAttribute("listSuDungDichVus", suDungDichVus);
		return "sudungdichvu/list";		//link jsp
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)	//chuyen link
	public String displayCreate(Model model) {
		model.addAttribute("sudungdichvu", new SuDungDichVu());
		model.addAttribute("dichvus", dichVuService.getList());
		model.addAttribute("khachhangs", khachHangService.getList());
		return "sudungdichvu/create";
	}	

	@RequestMapping(value = "/create", method = RequestMethod.POST)	//tao may
	public String create(@Valid @ModelAttribute SuDungDichVu dichvu, BindingResult bindingResult, Model model) {
		sudungdichvuService.save(dichvu);
		return "redirect:/sudungdichvu/list";
	}

}
