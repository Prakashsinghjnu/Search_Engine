package searchengine;

import java.lang.reflect.GenericSignatureFormatError;
import java.text.NumberFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.ui.Model;
@Controller
public class SearchController {
	
	
	 @RequestMapping("/{id}")
	    public String getUser(@PathVariable("id") String id) {
	        // Logic to get the user based on id
		 System.out.println(id);
	       return "null-page";
	    }

	@RequestMapping("/home")
	public String home() {
		
		
		
		return "home";
	}
	
	@RequestMapping("/search")
	
	public RedirectView search(@RequestParam ("quarybox") String query) {
		
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectview= new RedirectView();
		
		redirectview.setUrl(url);
		
		return redirectview;
	}
	  
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull() {
		
		
		return "null_page";
	}
	
	@ExceptionHandler(value=NumberFormatException.class )
	public String eceptionHandler(Model m) {
		m.addAttribute("msg","oops!NumberFormateException Occured");
		return "null_page";
	}
	@ExceptionHandler(value=Exception.class)
	public String genricexceptionHandling(Model m) {
		return "null_page";
	}
	
}
