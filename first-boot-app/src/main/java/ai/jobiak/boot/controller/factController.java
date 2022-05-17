package ai.jobiak.boot.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class factController {
	
	@RequestMapping(path="/fact",method=RequestMethod.GET)
	public String test(@RequestParam(name="number",defaultValue="invalid",required=false)String num,Model model) {
		
		
		int fact=1, num1=5;
		for(int i=1;i<=num1;i++) {
			fact =fact*i;
		}
		model.addAttribute("result",fact);
		
		return "result";		
	}

}
