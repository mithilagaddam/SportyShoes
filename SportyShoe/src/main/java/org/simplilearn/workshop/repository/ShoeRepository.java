package org.simplilearn.workshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.simplilearn.workshop.model.*;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Integer>{
	
}