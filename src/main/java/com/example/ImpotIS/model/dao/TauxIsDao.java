package com.example.ImpotIS.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.TauxIs;

@Repository
public interface TauxIsDao extends JpaRepository<TauxIs, Long>{
	public Optional<TauxIs> findById(Long id);//????
	public List<TauxIs> findAll();
	
	@Query("SELECT t.pourcentage FROM TauxIs t WHERE t.id=:id")
	public Float getPerct(@Param("id") Long id);
	

}
