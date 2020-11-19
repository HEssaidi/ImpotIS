package com.example.ImpotIS.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.ClasseComptable;
import com.example.ImpotIS.bean.DeclarationISSociete;

@Repository
public interface DeclarationISSocieteDao extends JpaRepository<DeclarationISSociete, Long>{
	public Optional<DeclarationISSociete> findById(Long id);

	public List<DeclarationISSociete> findAll();
}
