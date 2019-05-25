package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.xwork.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.UploadedImageFile;

@Controller
public class UploadController {
	@RequestMapping("/uploadImage")
	public ModelAndView	upload(HttpServletRequest request, UploadedImageFile imageFile) throws IllegalStateException, IOException {
		String name=RandomStringUtils.randomAlphabetic(10);
		String newFileName=name+".jpg";
		File newFile=new File(request.getServletContext().getRealPath("/image"),newFileName);
		newFile.getParentFile().mkdirs();
		imageFile.getImage().transferTo(newFile);
       
        ModelAndView mav = new ModelAndView("showUploadedFile");
        mav.addObject("imageName", newFileName);
        return mav;
	}
}
