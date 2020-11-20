package com.example.ImpotIS.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ImpotIS.model.dao.ClasseComptableDao;
import com.example.ImpotIS.model.service.facade.ClasseComptableService;

public class ClasseComptableServiceImpl implements ClasseComptableService{
	@Autowired
	private  ClasseComptableDao  ClasseComptableDao;
}
