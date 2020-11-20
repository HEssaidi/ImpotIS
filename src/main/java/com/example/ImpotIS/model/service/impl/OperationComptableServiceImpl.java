package com.example.ImpotIS.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ImpotIS.model.dao.OperationComptableDao;
import com.example.ImpotIS.model.service.facade.OperationComptableService;

public class OperationComptableServiceImpl implements OperationComptableService{
	@Autowired
	private OperationComptableDao OperationComptableDao;
}
