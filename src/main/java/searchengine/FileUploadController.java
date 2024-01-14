package searchengine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	@RequestMapping(value="/uploadimage" ,method=RequestMethod.POST)
	public String fileUpload(@RequestParam("upload") CommonsMultipartFile file, HttpSession s,Model model) {
		System.out.println("fileuploadmethod/handler");	
		System.out.println(file.getSize());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getStorageDescription());
		byte[] data =file.getBytes();
		// we have to save this file to server
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
				file.getOriginalFilename();
		System.out.println(path);
		try {
			
		
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("File Uploaded");
		model.addAttribute("filename",file.getOriginalFilename());
		//model.addAttribute("msg", "Uploaded sucessfully");
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Uploading error");
			model.addAttribute("msg", "Uploading Error!!");
		}
		return "filesuccess";
	}
}
