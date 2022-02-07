package Fastag.INDIA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Fastag.INDIA.entity.fastag;
@RestController
@RequestMapping("/text")
@CrossOrigin(origins="http://localhost:3000")
public class TollController {
	@Autowired
	TollService apple;
	
	@GetMapping("/")
	public List <fastag> good()
	{
		return apple.readEverything();
	}

	@GetMapping("/{cube}")
	public fastag ice(@PathVariable("cube")String cube)
	{
		return apple.readOne(cube);
	}
	
	@DeleteMapping("/remove/{id}")
	public String hemsworth(@PathVariable("id")String id)
	{
		return apple.eraseOne(id);
	}
}
