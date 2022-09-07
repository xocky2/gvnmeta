package com.gvnrsbs.gvnmeta.servicies;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gvnrsbs.gvnmeta.entities.Sale;
import com.gvnrsbs.gvnmeta.repositories.SaleRepository;


@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<Sale> findSales(String minDate, String maxDate,Pageable pageable) {
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		// conversão das datas de String para LocalDate
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		
		return repository.findSales(min,max,pageable);
	}
}
