package com.example.ImpotIS.model.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ImpotIS.bean.CompteComptable;
import com.example.ImpotIS.bean.OperationComptable;
import com.example.ImpotIS.bean.Societe;

public interface OperationComptableDao extends JpaRepository<OperationComptable, Long> {
	public List<OperationComptable> findBySociete(Societe societe);

	public List<OperationComptable> findByMontant(float montant);

	public List<OperationComptable> findByLibelle(String libelle);

	public List<OperationComptable> findByDateOperation(Date dateOperation);

	public List<OperationComptable> findByTypeOperationComptableAndCompteComptableAndSocieteAndDateOperation(
			boolean TypeOperationComptable, CompteComptable c, Societe s, Date d);

	public List<OperationComptable> findByCompteComptable(CompteComptable c);

	public List<OperationComptable> findByCompteComptableAndSociete(CompteComptable c, Societe s);

}
