package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path= "/helloworld", method=RequestMethod.GET)
	public String sayHello(){
		return "Hello World!";
	}
}