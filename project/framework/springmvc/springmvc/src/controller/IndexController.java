package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
import org.springframework.stereotype.Controller;
//���涨λ
/*public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		ModelAndView mav=new ModelAndView("index.jsp");
		ModelAndView mav=new ModelAndView("index");
		mav.addObject("message", "Hello SpringMVC From ZFD");
		return mav;
	}
	
}
*/

//ע�ⷽʽ��λ��ͼ
@Controller
public class IndexController {
    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
}