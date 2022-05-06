package com.flight.booking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.booking.repository.entity.RoasterEntity;

public interface RoasterRepository extends JpaRepository<RoasterEntity, Integer> {

	List<RoasterEntity> findAllByRoasterDate(Date roasterDate);
}
