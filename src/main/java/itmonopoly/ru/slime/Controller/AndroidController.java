package itmonopoly.ru.slime.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itmonopoly.ru.slime.DB.SQLconnect;

@RestController
@RequestMapping("Android")
public class AndroidController {
	SQLconnect db = new SQLconnect();

	@GetMapping
	public String getWelcomeMessage() {

		String welcomeMessage = "Hello!";
		return welcomeMessage;
	}
}