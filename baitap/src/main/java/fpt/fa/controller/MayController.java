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

import fpt.fa.entities.May;
import fpt.fa.service.MayService;


@Controller
@RequestMapping(value = "/may")		//tenfolder
public class MayController {
	@Autowired
	MayService mayService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)	//ten link address
	public String list(Model model) {
		List<May> mays = mayService.getList();	
		model.addAttribute("listMays", mays);
		return "may/list";		//link jsp
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)	//chuyen link
	public String displayCreate(Model model) {
		model.addAttribute("may", new May());
		return "may/create";
	}	

	@RequestMapping(value = "/create", method = RequestMethod.POST)	//tao may
	public String create(@Valid @ModelAttribute May may, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "may/create";
		}
		mayService.save(may);
		return "redirect:/may/list";//27
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)		//lay chuyen sang trang update
	public String displayUpdate(@RequestParam int id, Model model) {
		model.addAttribute("updateMay", mayService.getMayById(id));
		return "may/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)		//lay o trang update roi update
	public String update(@ModelAttribute(name = "updateMay") May may, Model model) {
		
		mayService.update(may);
		return "redirect:/may/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam int id, Model model) {
		mayService.deleteById(id);
		return "redirect:/may/list";
	}
}
