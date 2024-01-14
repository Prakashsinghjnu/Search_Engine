package searchengine;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class FormController {
		@RequestMapping("/complex") 
		public String showForm() {
			System.out.println("frontcontroller called");
			
			return"complex-form";
		}
		@RequestMapping(path="/handleform",method = RequestMethod.POST)
		public String formHandler(@ModelAttribute("student") Student student,BindingResult result ) {
			if(result.hasErrors()) {
				return "complex-form";
			}
			System.out.println(student);
			System.out.println(student.getAddress());
			return "sucess";
		}
		
}
