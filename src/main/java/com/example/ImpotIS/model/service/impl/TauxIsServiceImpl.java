package com.example.ImpotIS.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.ImpotIS.model.dao.TauxIsDao;
import com.example.ImpotIS.model.service.facade.TauxIsService;

public class TauxIsServiceImpl implements TauxIsService {
	@Autowired
	private TauxIsDao tauxIsDao;
}
