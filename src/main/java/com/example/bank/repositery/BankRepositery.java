package com.example.bank.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bank.entity.Bank;

public interface BankRepositery extends JpaRepository<Bank, Integer> {

	@Query(value = "select ifsc_code from bank where branch=?", nativeQuery = true)
	public String getBranchByIfsc(String name);

}
