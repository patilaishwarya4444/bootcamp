package Fastag.INDIA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Fastag.INDIA.entity.fastag;
@Service
public class TollService {
	@Autowired
	TollRepository mango;
	
	public List <fastag> readEverything()
	{
			return mango.findAll();
	}
	public fastag readOne(String id)
	{
		return mango.findById(id).orElse(new fastag());
	}
	
	public String eraseOne(String id)
	{
		String name=readOne(id).getCarNum()+""+readOne(id).getBalance()+"has deleted\n";
		mango.deleteById(id);
		return name;
	}
}
