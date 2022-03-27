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

import fpt.fa.entities.KhachHang;
import fpt.fa.service.KhachHangService;



@Controller
@RequestMapping(value = "/khachhang")		//tenfolder
public class KhachHangController {
	@Autowired
	KhachHangService khachHangService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)	//ten link address
	public String list(Model model) {
		List<KhachHang> khachHangs = khachHangService.getList();	
		model.addAttribute("listKhachHangs", khachHangs);
		return "khachhang/list";		//link jsp
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)	//chuyen link
	public String displayCreate(Model model) {
		model.addAttribute("khachhang", new KhachHang());
		return "khachhang/create";
	}	

	@RequestMapping(value = "/create", method = RequestMethod.POST)	//tao may
	public String create(@Valid @ModelAttribute KhachHang kh, BindingResult bindingResult, Model model) {
		khachHangService.save(kh);
		return "redirect:/khachhang/list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)		//lay truoc
	public String displayUpdate(@RequestParam int id, Model model) {
		model.addAttribute("updateKhachHang", khachHangService.getKhachHangById(id));
		return "khachhang/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)		//lay o tren roi update
	public String update(@ModelAttribute(name = "updateKhachHang") KhachHang khachhang, Model model) {
		khachHangService.update(khachhang);
		return "redirect:/khachhang/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam int id, Model model) {
		khachHangService.deleteById(id);
		return "redirect:/khachhang/list";
	}
}
