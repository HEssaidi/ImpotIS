package com.example.ImpotIS.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.ImpotIS.bean.OperationComptable;

public interface OperationComptableDao extends JpaRepository<OperationComptable, Long>{
	public Optional<OperationComptable> findById(Long id);

	public List<OperationComptable> findAll();


}
