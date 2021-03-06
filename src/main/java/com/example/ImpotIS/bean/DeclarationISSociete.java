package com.example.ImpotIS.bean;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class DeclarationISSociete {
	@Id  //chaque entité doit etre marque avec un @Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id; 
	private String reference; 
	private Long annee; 
	@ManyToOne
	private Societe societe; 
	private BigDecimal chiffreAffaire; 
	private BigDecimal totalCharges; 
	private BigDecimal benifice ;//  calculable 
	private BigDecimal montantBaseIs; //
	private Long nombreMoisRetard; 
	private BigDecimal montantRetard; 
	private BigDecimal montantTotal; //  calculable 
	private Date dateDeclarationIs;
	@ManyToOne
	private TauxIs tauxIs;
	
	
	public DeclarationISSociete() {
	}


	public DeclarationISSociete(Long id, String reference, Long annee, Societe societe, BigDecimal chiffreAffaire,
			BigDecimal totalCharges, BigDecimal montantBaseIs, Long nombreMoisRetard, BigDecimal montantRetard, BigDecimal montantTotal,
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


	public BigDecimal getChiffreAffaire() {
		return chiffreAffaire;
	}


	public void setChiffreAffaire(BigDecimal chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}


	public BigDecimal getTotalCharges() {
		return totalCharges;
	}


	public void setTotalCharges(BigDecimal totalCharges) {
		this.totalCharges = totalCharges;
	}


	public BigDecimal getMontantBaseIs() {
		return montantBaseIs;
	}


	public void setMontantBaseIs(BigDecimal montantBaseIs) {
		this.montantBaseIs = montantBaseIs;
	}


	public Long getNombreMoisRetard() {
		return nombreMoisRetard;
	}


	public void setNombreMoisRetard(Long nombreMoisRetard) {
		this.nombreMoisRetard = nombreMoisRetard;
	}


	public BigDecimal getMontantRetard() {
		return montantRetard;
	}


	public void setMontantRetard(BigDecimal montantRetard) {
		this.montantRetard = montantRetard;
	}


	public BigDecimal getMontantTotal() {
		return montantTotal;
	}


	public void setMontantTotal(BigDecimal montantTotal) {
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
