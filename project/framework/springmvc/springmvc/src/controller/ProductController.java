 package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

@Controller
public class ProductController {
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product) {
		ModelAndView modelAndView=new ModelAndView("showProduct");
		return modelAndView;
	}
	@RequestMapping("/jump")
	public ModelAndView	jump() {
		ModelAndView adv=new ModelAndView("redirect:/index");
		return adv;
	}
	@RequestMapping("/check")
	public ModelAndView check(HttpSession session) {
		Integer integer= (Integer)session.getAttribute("count");
		if(null==integer)
		{
			integer=0;
		}
		integer++;
		session.setAttribute("count", integer);
		ModelAndView modelAndView=new ModelAndView("check");
		return modelAndView;
	}
	
}
