package com.example.ImpotIS.bean;

import java.sql.Date;

public class DeclarationISSociete {
    private Long id; 
	private String reference; 
	private Long annee; 
	private Societe societe; 
	private Float chiffreAffaire; 
	private Float totalCharges; 
	//private Float benifice ;//  calculable 
	private Float montantBaseIs; //
	private Long nombreMoisRetard; 
	private Float montantRetard; 
	private Float montantTotal; //  calculable 
	private Date dateDeclarationIs;
	
	
	public DeclarationISSociete() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DeclarationISSociete(Long id, String reference, Long annee, Societe societe, Float chiffreAffaire,
			Float totalCharges, Float montantBaseIs, Long nombreMoisRetard, Float montantRetard, Float montantTotal,
			Date dateDeclarationIs) {
		super();
		this.id = id;
		this.reference = reference;
		this.annee = annee;
		this.societe = societe;
		this.chiffreAffaire = chiffreAffaire;
		this.totalCharges = totalCharges;
		this.montantBaseIs = montantBaseIs;
		this.nombreMoisRetard = nombreMoisRetard;
		this.montantRetard = montantRetard;
		this.montantTotal = montantTotal;
		this.dateDeclarationIs = dateDeclarationIs;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public Long getAnnee() {
		return annee;
	}


	public void setAnnee(Long annee) {
		this.annee = annee;
	}


	public Societe getSociete() {
		return societe;
	}


	public void setSociete(Societe societe) {
		this.societe = societe;
	}


	public Float getChiffreAffaire() {
		return chiffreAffaire;
	}


	public void setChiffreAffaire(Float chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}


	public Float getTotalCharges() {
		return totalCharges;
	}


	public void setTotalCharges(Float totalCharges) {
		this.totalCharges = totalCharges;
	}


	public Float getMontantBaseIs() {
		return montantBaseIs;
	}


	public void setMontantBaseIs(Float montantBaseIs) {
		this.montantBaseIs = montantBaseIs;
	}


	public Long getNombreMoisRetard() {
		return nombreMoisRetard;
	}


	public void setNombreMoisRetard(Long nombreMoisRetard) {
		this.nombreMoisRetard = nombreMoisRetard;
	}


	public Float getMontantRetard() {
		return montantRetard;
	}


	public void setMontantRetard(Float montantRetard) {
		this.montantRetard = montantRetard;
	}


	public Float getMontantTotal() {
		return montantTotal;
	}


	public void setMontantTotal(Float montantTotal) {
		this.montantTotal = montantTotal;
	}


	public Date getDateDeclarationIs() {
		return dateDeclarationIs;
	}


	public void setDateDeclarationIs(Date dateDeclarationIs) {
		this.dateDeclarationIs = dateDeclarationIs;
	}


	@Override
	public String toString() {
		return "DeclarationISSociete [id=" + id + ", reference=" + reference + ", annee=" + annee + ", societe="
				+ societe + ", chiffreAffaire=" + chiffreAffaire + ", totalCharges=" + totalCharges + ", montantBaseIs="
				+ montantBaseIs + ", nombreMoisRetard=" + nombreMoisRetard + ", montantRetard=" + montantRetard
				+ ", montantTotal=" + montantTotal + ", dateDeclarationIs=" + dateDeclarationIs + "]";
	} 
	
	
	
	
	
}
