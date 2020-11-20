package com.example.ImpotIS.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ImpotIS.model.dao.DeclarationISSocieteDao;
import com.example.ImpotIS.model.service.facade.DeclarationISSocieteService;

public class DeclarationISSocieteServiceImpl implements DeclarationISSocieteService{
	@Autowired
	private DeclarationISSocieteDao DeclarationISSocieteDao;
}
