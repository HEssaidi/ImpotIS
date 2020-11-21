package com.example.ImpotIS.model.service.facade;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.ImpotIS.bean.TauxIs;
@Service
public interface TauxIsService {
	    public Optional<TauxIs>  findById(Long id);
		public TauxIs findByMontantMaxAndMontantMin(Float montantMax,Float montantMin); //get attributes by montant
		
		public List<TauxIs> findAll();
		public TauxIs findByLibelle(String libelle);
		public TauxIs findByPourcentage(Float pourcentage);
		public void deleteById(Long id);
		public TauxIs save(TauxIs tauxIs);
	

}
