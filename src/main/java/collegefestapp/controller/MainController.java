package collegefestapp.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import collegefestapp.dao.CollegeDao;
import collegefestapp.model.StudentDetails;

@Controller
public class MainController {

	@Autowired
	private CollegeDao collegeDao;

	@RequestMapping("/")
	public String home(Model m) {
		List<StudentDetails> sd = collegeDao.getStudentDetails();
		m.addAttribute("students", sd);

		return "index";
	}

	@RequestMapping("/add-student")
	public String newStudentForm(Model m) {
		m.addAttribute("title", "New student Form");

		return "add-form";
	}
	
	@RequestMapping(value="/save" , method=RequestMethod.POST)
	public RedirectView saveStudent(@ModelAttribute StudentDetails studentDetails, HttpServletRequest request ) {
		System.out.println(studentDetails);
		collegeDao.createStudent(studentDetails);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}	

	// delete handler
	@RequestMapping("/delete/{studentId}")
	public RedirectView deleteStudentDetails(@PathVariable("studentId") int studentId, HttpServletRequest request) {
		this.collegeDao.deleteStudentDetails(studentId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;

	}



}
