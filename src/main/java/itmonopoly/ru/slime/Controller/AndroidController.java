package itmonopoly.ru.slime.Controller;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import itmonopoly.ru.slime.DB.Sqllite3;

@RestController

public class AndroidController {

	@GetMapping
	@RequestMapping("Android")
	public String getWelcomeMessage() throws ClassNotFoundException, SQLException {
		Sqllite3.Conn();
		Sqllite3.WriteDB();

		String welcomeMessage = "Database writed!";
		Sqllite3.CloseDB();
		return welcomeMessage;
	}
}