package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SchoolController {

	@Autowired
	private StudRep studRep;
	
	@GetMapping("/Students/All")
	public Iterable<Students> index() {
		return studRep.findAll();
	}
	
	@PostMapping("/Students/Add")
	public void AddStudent(@RequestBody String naam) {
		System.out.println(naam);
	}
	
	
}
