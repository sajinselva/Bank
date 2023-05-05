package com.example.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Bank;
import com.example.bank.service.BankService;

@RestController
public class BankController {
	@Autowired
	BankService bankserv;

	@PostMapping(value = "/addBank")
	public String addBank(@RequestBody Bank user) {
		return bankserv.addBank(user);
	}

	@GetMapping(value = "/getById/{id}")
	public Bank getBank(@PathVariable int id) {
		return bankserv.getBank(id);
	}

	@PutMapping(value = "/update/{id}")
	public String updateBank(@RequestBody Bank id) {
		return bankserv.updateBank(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteBank(@PathVariable int id) {
		return bankserv.deleteBank(id);
	}

	@PostMapping(value = "/addBanks")
	public String addBanks(@RequestBody List<Bank> usr) {
		return bankserv.addBanks(usr);

	}

	@GetMapping(value = "/getList")
	public List<Bank> getBanks() {
		return bankserv.getBanks();
	}

	@GetMapping(value = "getIfsc/{branch}")
	public String getIfscByBranch(@PathVariable String branch) {
		return bankserv.getIfscByBranch(branch);
	}

}
