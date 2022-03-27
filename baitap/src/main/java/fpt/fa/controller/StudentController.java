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

import fpt.fa.entities.Student;
import fpt.fa.service.StudentService;
import fpt.fa.validated.StudentValided;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Student> students = studentService.getList();
		model.addAttribute("listStudents", students);
		return "student/list";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String displayCreate(Model model) {
		model.addAttribute("student", new Student());
		return "student/create";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute Student student, BindingResult bindingResult, Model model) {
		StudentValided valided = new StudentValided();
		valided.validate(student, bindingResult);
		if (bindingResult.hasErrors()) {
			return "student/create";
		}
		studentService.save(student);
		return "redirect:/student/list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)		//lay truoc
	public String displayUpdate(@RequestParam String id, Model model) {
		model.addAttribute("updateStudent", studentService.getStudentById(id));
		return "student/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)		//lay o tren roi update
	public String update(@ModelAttribute(name = "updateStudent") Student student, Model model) {
		studentService.update(student);
		return "redirect:/student/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam String id, Model model) {
		studentService.deleteById(id);
		return "redirect:/student/list";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(@RequestParam(name = "id") Student student, Model model) {
		model.addAttribute("student", student);
		return "/student/detail";
	}
}
