package com.example.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bank.entity.Bank;
import com.example.bank.repositery.BankRepositery;

@Repository
public class BankDao {
	@Autowired
	BankRepositery bankrep;

	public String addBank(Bank emp) {
		bankrep.save(emp);
		return "Successfully Saved";
	}

	public Bank getBank(int id) {

		return bankrep.findById(id).get();

	}

	public String updateBank(Bank id) {
		bankrep.save(id);

		return "Successfully updated";
	}

	public String deleteBank(int id) {

		bankrep.deleteById(id);
		return "delete successfully";

	}

	public String addBanks(List<Bank> emp) {
		bankrep.saveAll(emp);
		return "Successfully added";
	}

	public List<Bank> getBanks() {

		return bankrep.findAll();
	}

	public String getIfscByBranch(String branch) {

		return bankrep.getBranchByIfsc(branch);
	}

}
