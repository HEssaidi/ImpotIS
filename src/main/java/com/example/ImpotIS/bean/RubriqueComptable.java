package com.example.ImpotIS.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RubriqueComptable {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 
	private String code; 
	private String libelle; 
	private ClasseComptable classeComptable;
	
	public RubriqueComptable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RubriqueComptable(Long id, String code, String libelle, ClasseComptable classeComptable) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.classeComptable = classeComptable;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public ClasseComptable getClasseComptable() {
		return classeComptable;
	}

	public void setClasseComptable(ClasseComptable classeComptable) {
		this.classeComptable = classeComptable;
	}

	@Override
	public String toString() {
		return "RubriqueComptable [id=" + id + ", code=" + code + ", libelle=" + libelle + ", classeComptable="
				+ classeComptable + "]";
	} 
	
	
	
	
}
