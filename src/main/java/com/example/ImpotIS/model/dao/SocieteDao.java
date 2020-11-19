package com.example.ImpotIS.model.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.Societe;

@Repository
public interface SocieteDao extends JpaRepository<Societe,Long>{
	public Societe findByIdOrIce(Long id, String ice);

	public List<Societe> findAll();
}
