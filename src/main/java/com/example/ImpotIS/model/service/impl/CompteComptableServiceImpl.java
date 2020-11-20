package com.example.ImpotIS.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ImpotIS.model.dao.CompteComptableDao;
import com.example.ImpotIS.model.dao.DeclarationISSocieteDao;
import com.example.ImpotIS.model.service.facade.CompteComptableService;


public class CompteComptableServiceImpl implements CompteComptableService{
	@Autowired
	private  CompteComptableDao  CompteComptableDao;

}
