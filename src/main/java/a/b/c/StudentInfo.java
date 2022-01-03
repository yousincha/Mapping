package a.b.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentInfo {

	@RequestMapping("/index")
	public String index() {
		return "studentForm";
	}
	
	@RequestMapping("/studentView")
	public String studentView(@ModelAttribute("studentInfo") 
							StudentInformation studentInformation) {
		return "studentView";
	}
}
