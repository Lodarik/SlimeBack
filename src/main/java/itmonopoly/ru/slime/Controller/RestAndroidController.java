package itmonopoly.ru.slime.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import itmonopoly.ru.slime.Model.Ticket;



@RestController
public class RestAndroidController {

	Ticket tic1 = new Ticket("1", "one", "one", "one", "one", false);
	Ticket tic2 = new Ticket("2", "two", "two", "two", "two", false);
	
	ArrayList<Ticket> li = new ArrayList<Ticket>();
   
	
	@RequestMapping(value = "RestTicket", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Ticket> RestTicket(){
		li.add(tic1);
		li.add(tic2);
		return li;
	}
	
}
