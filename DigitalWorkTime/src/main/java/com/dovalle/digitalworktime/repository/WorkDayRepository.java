package com.dovalle.digitalworktime.repository;

import com.dovalle.digitalworktime.model.WorkDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkDayRepository extends JpaRepository<WorkDay, Long> {

}
