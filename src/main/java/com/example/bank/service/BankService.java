package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.dao.BankDao;
import com.example.bank.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bankdao;

	public String addBank(Bank bank) {
		return bankdao.addBank(bank);
	}

	public Bank getBank(int id) {

		return bankdao.getBank(id);
	}

	public String updateBank(Bank id) {

		return bankdao.updateBank(id);
	}

	public String deleteBank(int id) {

		return bankdao.deleteBank(id);
	}

	public String addBanks(List<Bank> bank) {

		return bankdao.addBanks(bank);
	}

	public List<Bank> getBanks() {

		return bankdao.getBanks();
	}

	public String getIfscByBranch(String branch) {

		return bankdao.getIfscByBranch(branch);
	}

}
