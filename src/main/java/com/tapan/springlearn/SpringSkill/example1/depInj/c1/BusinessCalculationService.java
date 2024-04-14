package com.tapan.springlearn.SpringSkill.example1.depInj.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		Super();
		this.dataService = dataService;

	}

	private void Super() {
		// TODO Auto-generated method stub

	}
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);

	}

}
