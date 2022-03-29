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

import fpt.fa.entities.SuDungMay;
import fpt.fa.service.KhachHangService;
import fpt.fa.service.MayService;
import fpt.fa.service.SuDungMayService;



@Controller
@RequestMapping(value = "/sudungmay")		//tenfolder
public class SuDungMayController {
	@Autowired
	SuDungMayService sudungmayService;
	
	@Autowired
	MayService mayService;
	
	@Autowired
	KhachHangService khachHangService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)	//ten link address
	public String list(Model model) {
		List<SuDungMay> suDungMays = sudungmayService.getList();	
		model.addAttribute("listSuDungMays", suDungMays);
		return "sudungmay/list";		//link jsp
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)	//chuyen link
	public String displayCreate(Model model) {	
		model.addAttribute("sudungmay", new SuDungMay());
		model.addAttribute("mays", mayService.getList());
		model.addAttribute("khachhangs", khachHangService.getList());
		return "sudungmay/create";
	}	

	@RequestMapping(value = "/create", method = RequestMethod.POST)	//tao may
	public String create(@Valid @ModelAttribute SuDungMay sudungmay, BindingResult bindingResult, Model model) {
		sudungmayService.save(sudungmay);
		return "redirect:/sudungmay/list";
	}

}
