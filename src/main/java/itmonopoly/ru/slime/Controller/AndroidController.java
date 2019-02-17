package itmonopoly.ru.slime.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Android")
public class AndroidController{
@GetMapping
public String getWelcomeMessage() {
	String welcomeMessage;
	return welcomeMessage = "Hello!";
}
}