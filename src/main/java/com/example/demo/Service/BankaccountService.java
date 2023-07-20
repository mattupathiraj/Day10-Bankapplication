package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bankaccount;

import com.example.demo.Repo.BankaccountRepo;

@Service
public class BankaccountService {
	@Autowired //extends another class
	BankaccountRepo stRepo; //reference variable
	
	public Bankaccount save(Bankaccount ar) {
		return stRepo.save(ar);
	}
	public List <Bankaccount>getDetails()

{
		return stRepo.findAll();
		
}
	public Bankaccount UpdateDetails(Bankaccount b1)
	{
		return stRepo.saveAndFlush(b1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}



