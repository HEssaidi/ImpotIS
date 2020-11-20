package com.example.ImpotIS.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.TauxIs;

@Repository
public interface TauxIsDao extends JpaRepository<TauxIs, Long>{
	
	//@Query("SELECT t.pourcentage FROM TauxIs t WHERE t.montantMax=:montantMax and t.montantMin=:montantMin")
	public TauxIs findByMontantMaxAndMontantMin(Float montantMax,Float montantMin); //get attributes by montant
	
	//@Query("SELECT t.montantRetard FROM TauxIs t WHERE t.montantMax=:montantMax and t.montantMin=:montantMin")
	//public Float getMontantRetardByMontant(@Param("montantMax") Float montantMax,@Param("montantMin") Float montantMin);
	//@Query("SELECT t.montantRetard FROM TauxIs t WHERE t.pourcentage=:pourcentage")
	public TauxIs findByLibelle(String libelle);
	public TauxIs findByPourcentage(Float pourcentage);
	//@SuppressWarnings("unchecked")
	//public TauxIs save(TauxIs tauxIs);
	
}
