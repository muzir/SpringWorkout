package com.springWorkout.dao;

import com.springWorkout.domain.ApiLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApiLogDao extends JpaRepository<ApiLog, String> {

}
