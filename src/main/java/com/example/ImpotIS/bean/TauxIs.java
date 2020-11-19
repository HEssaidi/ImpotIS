package com.example.ImpotIS.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TauxIs {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String libelle;
	private Float montantMax;
	private Float montantMin;
	private Float pourcentage;
	private Float montantRetard;
	
	
	
	public TauxIs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TauxIs(Long id, String libelle, Float montantMax, Float montantMin, Float pourcentage, Float montantRetard) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.montantMax = montantMax;
		this.montantMin = montantMin;
		this.pourcentage = pourcentage;
		this.montantRetard = montantRetard;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Float getMontantMax() {
		return montantMax;
	}
	public void setMontantMax(Float montantMax) {
		this.montantMax = montantMax;
	}
	public Float getMontantMin() {
		return montantMin;
	}
	public void setMontantMin(Float montantMin) {
		this.montantMin = montantMin;
	}
	public Float getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(Float pourcentage) {
		this.pourcentage = pourcentage;
	}
	public Float getMontantRetard() {
		return montantRetard;
	}
	public void setMontantRetard(Float montantRetard) {
		this.montantRetard = montantRetard;
	} 
	@Override
	public String toString() {
		return "TauxIs [id=" + id + ", libelle=" + libelle + ", montantMax=" + montantMax + ", montantMin=" + montantMin
				+ ", pourcentage=" + pourcentage + ", montantRetard=" + montantRetard + "]";
	}
	

}
