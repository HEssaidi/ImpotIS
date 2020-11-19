package com.example.ImpotIS.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.ClasseComptable;
@Repository
public interface ClasseComptableDao extends JpaRepository<ClasseComptable, Long>{
	public Optional<ClasseComptable> findById(Long id);

	public List<ClasseComptable> findAll();

}
