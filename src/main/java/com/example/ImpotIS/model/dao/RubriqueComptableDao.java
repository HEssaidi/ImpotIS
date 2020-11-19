package com.example.ImpotIS.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.RubriqueComptable;

@Repository
public interface RubriqueComptableDao extends JpaRepository<RubriqueComptable, Long> {
	public Optional<RubriqueComptable> findById(Long id);

	public List<RubriqueComptable> findAll();

}
