package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Bank;
import com.example.demo.Model.Bankaccount;
import com.example.demo.Model.Customers;
import com.example.demo.Repo.CustomersRepo;
import com.example.demo.Service.ApiService;
import com.example.demo.Service.BankaccountService;
import com.example.demo.Service.CustomerService;
@RestController
public class ApiController {
	
	@Autowired 
	ApiService stuService;
	@Autowired
	CustomerService stdService;
	@Autowired
	BankaccountService stmService;
	@PostMapping("/addDetails")
	public Bank addInfo(@RequestBody Bank st)
	{
		return stuService.saveDetails(st);
		}
	@PostMapping("/addDet")
	public Customers addInfo(@RequestBody Customers cr )
	{
		return stdService.savesign(cr);
		}
	@PostMapping("/addAcc")
	public Bankaccount addInfo(@RequestBody Bankaccount ar )
	{
		return stmService.save(ar);
		}
	@GetMapping("/showDetails")
		public List<Bank>fetchDetails(){
			return stuService.getDetails();
			}
		@PutMapping("/UpdateDetails")
		public Bank UpdateInfo(@RequestBody Bank st1){
			return stuService.UpdateDetails(st1);
			}
		
		@DeleteMapping("/Delete/{id}")
		public String deleteInfo (@PathVariable("id")int id) {
			stuService.deleteDetails(id);
			return "Deleted details";
			}
		}
