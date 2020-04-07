package springboot.app.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/test")
	public String sayHi() {
		return "testing";
	}
}
