package itmonopoly.ru.slime.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.NameNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AndroidController {

	private List<Map<String, String>> ticket = new ArrayList<Map<String, String>>() {
		{
			add(new HashMap<String, String>() {
				{
					put("id", "1");
					put("Text", "Frist message");
				}
			});
			add(new HashMap<String, String>() {
				{
					put("id", "2");
					put("Text", "Second message");
				}
			});
			add(new HashMap<String, String>() {
				{
					put("id", "3");
					put("Text", "Third message");
				}
			});

		}
	};

	@GetMapping
	@RequestMapping("Ticket")
	public String getWelcomeMessage() throws ClassNotFoundException, SQLException {

		String welcomeMessage = "Database writed!";

		return welcomeMessage;
	}

	@GetMapping("{id}")
	public Map<String, String> getOne(@PathVariable String id) throws NameNotFoundException {
		return ticket.stream().filter(ticket -> ticket.get("id").equals(id)).findFirst()
				.orElseThrow(NameNotFoundException::new);
	}
}