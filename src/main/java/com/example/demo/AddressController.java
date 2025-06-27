package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AddressController {

	@Autowired(required = false)
	MyRepo repo;
	@GetMapping("/address")
	public List<Address> show(){
		 return this.repo.findAll();
	}
	@PostMapping("/address")
	public Address addAddress(@RequestBody Address ad)
	{
		return this.repo.save(ad);
	}
	@DeleteMapping("/address")
	public String deleteByHno(@PathVariable int hno)
	{
		if(this.repo.findByHno(hno)!=null)
		{
			this.repo.deleteById(hno);
			return "Deleted!!!";
		}
		return "Detail For hno is not available ";
	}
}
