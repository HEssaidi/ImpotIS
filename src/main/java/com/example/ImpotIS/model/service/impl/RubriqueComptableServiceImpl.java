package com.example.ImpotIS.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ImpotIS.model.dao.RubriqueComptableDao;
import com.example.ImpotIS.model.service.facade.RubriqueComptableService;

public class RubriqueComptableServiceImpl implements RubriqueComptableService{
	@Autowired
	private RubriqueComptableDao rubriqueComptableDao;
}
