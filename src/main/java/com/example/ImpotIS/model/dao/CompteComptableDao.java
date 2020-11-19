package com.example.ImpotIS.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.ImpotIS.bean.CompteComptable;

@Repository
public interface CompteComptableDao extends JpaRepository<CompteComptable, Long>{
	public Optional<CompteComptable> findById(Long id);

	public List<CompteComptable> findAll();

}
