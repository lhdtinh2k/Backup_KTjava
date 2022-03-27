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
import fpt.fa.service.DichVuService;


@Controller
@RequestMapping(value = "/dichvu")		//tenfolder
public class DichVuController {
	@Autowired
	DichVuService dichvuService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)	//ten link address
	public String list(Model model) {
		List<DichVu> dichvus = dichvuService.getList();	
		model.addAttribute("listDichVus", dichvus);
		return "dichvu/list";		//link jsp
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)	//chuyen link
	public String displayCreate(Model model) {
		model.addAttribute("dichvu", new DichVu());
		return "dichvu/create";
	}	

	@RequestMapping(value = "/create", method = RequestMethod.POST)	//tao may
	public String create(@Valid @ModelAttribute DichVu dichvu, BindingResult bindingResult, Model model) {
		dichvuService.save(dichvu);
		return "redirect:/dichvu/list";
	}
}
