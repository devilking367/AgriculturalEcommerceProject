package com.project.ecommerc.mart247.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.project.ecommerc.mart247.entity.CartEntity;

@Repository
public interface CartRepository  extends JpaRepository<CartEntity, Long>{
	
	
	
	Optional<CartEntity> findById(Long id);

	

}