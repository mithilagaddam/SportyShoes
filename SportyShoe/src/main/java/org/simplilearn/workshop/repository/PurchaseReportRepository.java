package org.simplilearn.workshop.repository;


import java.util.Date;
import java.util.List;

import org.simplilearn.workshop.model.PurchaseReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PurchaseReportRepository extends JpaRepository<PurchaseReport, Integer>{
	public List<PurchaseReport> findByDop(Date dop);
	public List<PurchaseReport> findByCategory(String category);

}