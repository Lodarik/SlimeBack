package itmonopoly.ru.slime.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import itmonopoly.ru.slime.Model.Ticket;



@RestController
public class RestAndroidController {

	Ticket tic1 = new Ticket("1", "one", "one", "one", "one", false);
	Ticket tic2 = new Ticket("2", "two", "two", "two", "two", false);
	
	ArrayList<Ticket> li = new ArrayList<Ticket>();
   
	
//	@GetMapping({"RestTicket/full"})
//	public ArrayList<Ticket> RestTicket(){
//		li.add(tic1);
//		li.add(tic2);
//		return li;
//	}
	@GetMapping({"RestTicket/{id}"})
	public Ticket RestTicket(@RequestParam String id){
		int intid = Integer.parseInt(id);
		li.add(tic1);
		li.add(tic2);
		return li.get(intid);
	}
			
}
